
package xiangmu;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author daixuan
 * 2018年9月20日
 */
public class Environment implements Serializable{
	/**数据名称*/
	private String name;
	/**发送端id*/
	private Integer srcId;
	/**树莓派id*/
	private Integer desId;
	/**设备id*/
	private Integer devid;
	/**传感器地址*/
	private Integer sensorAddress;
	/**传感器个数*/
	private Integer counter;
	/**指令标号，3表示接受，6表示发送*/
	private Integer cmd;
	/**环境设置*/
	private Double data;
	/**是否采集成功，1成功0失败*/
	private Integer status;
	/**采集时间戳*/
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
		return "发送端id"+srcId+"树莓派id"+desId+"区域模块id"+desId
				+"传感器地址"+sensorAddress+"传感器数量"+counter+"指令标号"
		+cmd+"主体数据"+name+":"+data+"状态标识"+status+"采集时间"+time;
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
