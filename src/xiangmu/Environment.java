
package xiangmu;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author daixuan
 * 2018��9��20��
 */
public class Environment implements Serializable{
	/**��������*/
	private String name;
	/**���Ͷ�id*/
	private Integer srcId;
	/**��ݮ��id*/
	private Integer desId;
	/**�豸id*/
	private Integer devid;
	/**��������ַ*/
	private Integer sensorAddress;
	/**����������*/
	private Integer counter;
	/**ָ���ţ�3��ʾ���ܣ�6��ʾ����*/
	private Integer cmd;
	/**��������*/
	private Double data;
	/**�Ƿ�ɼ��ɹ���1�ɹ�0ʧ��*/
	private Integer status;
	/**�ɼ�ʱ���*/
	private Timestamp time;
	/**
	 * @param name
	 * @param srcId
	 * @param desId
	 * @param devid
	 * @param sensorAddress
	 * @param counter
	 * @param cmd
	 * @param date
	 * @param status
	 * @param time
	 */
	public Environment(String name, Integer srcId, Integer desId, Integer devid, Integer sensorAddress, Integer counter,
			Integer cmd, Double data, Integer status, Timestamp time) {
		super();
		this.name = name;
		this.srcId = srcId;
		this.desId = desId;
		this.devid = devid;
		this.sensorAddress = sensorAddress;
		this.counter = counter;
		this.cmd = cmd;
		this.data = data;
		this.status = status;
		this.time = time;
	}
	public Environment() {}
	public String toString() {
		// TODO Auto-generated method stub
		return "���Ͷ�id"+srcId+"��ݮ��id"+desId+"����ģ��id"+desId
				+"��������ַ"+sensorAddress+"����������"+counter+"ָ����"
		+cmd+"��������"+name+":"+data+"״̬��ʶ"+status+"�ɼ�ʱ��"+time;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the srcId
	 */
	public Integer getSrcId() {
		return srcId;
	}
	/**
	 * @param srcId the srcId to set
	 */
	public void setSrcId(Integer srcId) {
		this.srcId = srcId;
	}
	/**
	 * @return the desId
	 */
	public Integer getDesId() {
		return desId;
	}
	/**
	 * @param desId the desId to set
	 */
	public void setDesId(Integer desId) {
		this.desId = desId;
	}
	/**
	 * @return the devid
	 */
	public Integer getDevid() {
		return devid;
	}
	/**
	 * @param devid the devid to set
	 */
	public void setDevid(Integer devid) {
		this.devid = devid;
	}
	/**
	 * @return the sensorAddress
	 */
	public Integer getSensorAddress() {
		return sensorAddress;
	}
	/**
	 * @param sensorAddress the sensorAddress to set
	 */
	public void setSensorAddress(Integer sensorAddress) {
		this.sensorAddress = sensorAddress;
	}
	/**
	 * @return the counter
	 */
	public Integer getCounter() {
		return counter;
	}
	/**
	 * @param counter the counter to set
	 */
	public void setCounter(Integer counter) {
		this.counter = counter;
	}
	/**
	 * @return the cmd
	 */
	public Integer getCmd() {
		return cmd;
	}
	/**
	 * @param cmd the cmd to set
	 */
	public void setCmd(Integer cmd) {
		this.cmd = cmd;
	}
	/**
	 * @return the date
	 */
	public Double getData() {
		return data;
	}
	/**
	 * @param date the date to set
	 */
	public void setData(Double data) {
		this.data = data;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the time
	 */
	public Timestamp getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
