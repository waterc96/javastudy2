package xiangmu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
/**
 * 用来解析radwtmp文件。保存每行纪录为Environment对象 
 * @author daixuan
 * 2018年9月20日
 */
public class MyGather implements Serializable{
	private  ArrayList<Environment>  envs =new ArrayList<>();

	/**键代表传感器id，值代表名称*/ 
	public  Collection<Environment> gather(){
		log4j.logger.info("开始读取文件。。。..");
		//创建随机读取流对象
		RandomAccessFile raf=null;
		String line=null;
		try {
			raf=new RandomAccessFile("G:\\学习笔记\\项目文档\\SmartHome-Gather\\文档\\radwtmp", "r");
			while((line=raf.readLine())!=null){
				//调用转化方法
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
					log4j.logger.info("流关闭");
					raf.close();
					log4j.logger.info("读取文件结束");
				} catch (IOException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
				log4j.logger.error("文件关闭异常");
				}
			}
		}
		
		return envs;
		
	}
	public  void main(String[] args) {
		System.out.println(gather().toString());
	}
	/**
	 *字符创转化为Environment对象，然后放到集合中
	 *@param line 每行字符串
	 */
	private   void linetoEnvironment(String line) {
		String[] strs=line.split("[|]");
		Environment env=new Environment();
		String tem="16";
		String light="256";
		String co2="1280";
		
	
		if(tem.equals(strs[3])) {
			//获取温度对象
			env.setName("temperature");
	 		env.setData(Integer.parseInt
					(strs[6].substring(0, 4),16) * 0.00268127-46.85);
	 		add(env,strs);
	 		envs.add(env);
	 		//获取湿度对象
	 		env.setName("humidity");
	 		Environment humidity=new Environment();
	 		env.setData(Integer.parseInt
					(strs[6].substring(4, 8),16) * 0.00190735-6);
	 		add(humidity,strs);
	 	envs.add(env);
		}
		if(light.equals(strs[3])) {
			//获取光照对象
			env.setName("light");
			env.setData(Integer.parseInt
					(strs[6].substring(0,4),16)*1.0);
			add(env,strs);
			envs.add(env);
		}
		if(co2.equals(strs[3])) {
			//获取二氧化碳对象
			env.setName("co2");
			env.setData(Integer.parseInt
					(strs[6].substring(0,4),16)*1.0);
			add(env,strs);
			envs.add(env);
		}
	}
	/**
	 * @param env 环境对象
	 * @param strs 字符串数组
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
