package xiangmu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
/**
 * ��������radwtmp�ļ�������ÿ�м�¼ΪEnvironment���� 
 * @author daixuan
 * 2018��9��20��
 */
public class MyGather implements Serializable{
	private  ArrayList<Environment>  envs =new ArrayList<>();

	/**����������id��ֵ��������*/ 
	public  Collection<Environment> gather(){
		log4j.logger.info("��ʼ��ȡ�ļ�������..");
		//���������ȡ������
		RandomAccessFile raf=null;
		String line=null;
		try {
			raf=new RandomAccessFile("G:\\ѧϰ�ʼ�\\��Ŀ�ĵ�\\SmartHome-Gather\\�ĵ�\\radwtmp", "r");
			while((line=raf.readLine())!=null){
				//����ת������
				linetoEnvironment(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(raf!=null) {
				try {
					log4j.logger.info("���ر�");
					raf.close();
					log4j.logger.info("��ȡ�ļ�����");
				} catch (IOException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
				log4j.logger.error("�ļ��ر��쳣");
				}
			}
		}
		
		return envs;
		
	}
	public  void main(String[] args) {
		System.out.println(gather().toString());
	}
	/**
	 *�ַ���ת��ΪEnvironment����Ȼ��ŵ�������
	 *@param line ÿ���ַ���
	 */
	private   void linetoEnvironment(String line) {
		String[] strs=line.split("[|]");
		Environment env=new Environment();
		String tem="16";
		String light="256";
		String co2="1280";
		
	
		if(tem.equals(strs[3])) {
			//��ȡ�¶ȶ���
			env.setName("temperature");
	 		env.setData(Integer.parseInt
					(strs[6].substring(0, 4),16) * 0.00268127-46.85);
	 		add(env,strs);
	 		envs.add(env);
	 		//��ȡʪ�ȶ���
	 		env.setName("humidity");
	 		Environment humidity=new Environment();
	 		env.setData(Integer.parseInt
					(strs[6].substring(4, 8),16) * 0.00190735-6);
	 		add(humidity,strs);
	 	envs.add(env);
		}
		if(light.equals(strs[3])) {
			//��ȡ���ն���
			env.setName("light");
			env.setData(Integer.parseInt
					(strs[6].substring(0,4),16)*1.0);
			add(env,strs);
			envs.add(env);
		}
		if(co2.equals(strs[3])) {
			//��ȡ������̼����
			env.setName("co2");
			env.setData(Integer.parseInt
					(strs[6].substring(0,4),16)*1.0);
			add(env,strs);
			envs.add(env);
		}
	}
	/**
	 * @param env ��������
	 * @param strs �ַ�������
	 */
	private  void add(Environment env,String[] strs) {
		env.setSrcId(Integer.parseInt(strs[0]));
 		env.setDesId(Integer.parseInt(strs[1]));
 		env.setDevid(Integer.parseInt(strs[2]));
 		env.setSensorAddress(Integer.parseInt(strs[3]));
 		env.setCounter(Integer.parseInt(strs[4]));
 		env.setCmd(Integer.parseInt(strs[5]));
 		env.setStatus(Integer.parseInt(strs[7]));
 		env.setTime(new Timestamp(Long.parseLong(strs[8])));
	}

}
