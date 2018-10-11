/**
 * 
 */
package xml;

/**
 * @author daixuan
 *
 * 2018��9��5��
 */


import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
 
/**
 * ����XML�ļ�
 * @author Administrator
 */
public class xml_zong {
	
	
	/**
	 * ����������xml�ļ�
	 * @param listmap ��XML���ݲ���
	 * @param whole_Element�����ڵ�
	 * @param first_Element  һ���ڵ�
	 * @return  �����ַ���(true or false)
	 */
	public static String buildWriteToXml(List<Map<String,Object>> listmap,String whole_Element,String first_Element){
		String flag="false";
		DocumentBuilderFactory  fct=DocumentBuilderFactory.newInstance();
		try {
			    DocumentBuilder bui=fct.newDocumentBuilder();
	            Document doc=bui.newDocument();
	            Element ps=doc.createElement(whole_Element);
	            doc.appendChild(ps);
	            for(int i=0;i<listmap.size();i++){
	            	Map<String,Object> map=listmap.get(i);
	            	Element p1=doc.createElement(first_Element);
	            	Attr id1=doc.createAttribute("id");
	            	id1.setNodeValue(UUID.randomUUID().toString());
	            	ps.appendChild(p1);
	            	p1.setAttributeNode(id1);
	            	for(String key:map.keySet()){
	            		Element name1=doc.createElement(key);
	            		Text na1=doc.createTextNode((String)map.get(key));
	            		
	            		p1.appendChild(name1);
	                    name1.appendChild(na1);
	            	}
	            	
	            }
	            
                        
                        FileOutputStream fos=new FileOutputStream(new File("E:/longdada.xml"));
                  //      ((org.apache.crimson.tree.XmlDocument)doc).write(fos);
                        fos.flush();
                        fos.close();
                        
                        flag="true";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	/**
	 * ��ȡxml�ļ��е�����
	 * @param mapParms Ҫ��ȡ�Ľڵ���������и��ڵ�Ϊ"firstElement";
	 * @return 
	 */
	public static List<Map<String,Object>> queryFromXml(Map<String,Object> mapParms){
		List<Map<String,Object>> resultMaplist=new ArrayList<Map<String,Object>>();//���ؽ��
		try {
			 //�õ�DOM�������Ĺ���ʵ��
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            //��DOM�����л��DOM������
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            //��Ҫ������xml�ĵ�����DOM������
            Document doc = dbBuilder.parse("E:/longdada.xml");
            //�õ��ĵ�����Ϊper��Ԫ�صĽڵ��б�
            //==================
            String firstElement=(String)mapParms.get("firstElement");
            NodeList nList = doc.getElementsByTagName(firstElement);
            
              for(String key:mapParms.keySet()){
            		  if(!"firstElement".equals(key)){
            			//�����ü��ϣ���ʾ����е�Ԫ�ؼ�����Ԫ�ص�����
            			  Map<String,Object> m=new HashMap<String, Object>();
            			  m=(Map)mapParms.get(key);
            			  for(int j = 0; j< nList.getLength();j++){
            				  Map<String,Object> resultMap=new HashMap<String, Object>();
            				  Element node = (Element)nList.item(j);
            				  String id=node.getAttribute("id")==null?"":node.getAttribute("id");
            				  resultMap.put("id",id);
            			    for(String parmkey:m.keySet()){
            			      String keyValue=node.getElementsByTagName(parmkey).item(0).getFirstChild().getNodeValue();
                              System.out.println(parmkey+":"+ keyValue);
                              resultMap.put(parmkey, keyValue);
            			    }
            			    resultMaplist.add(resultMap);
            		    }
                	  }
              }
            //==================
            
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultMaplist;
	}
	
	
	/**
	 * ���Ѵ��ڵ�xml�ļ��в���Ԫ��
	 */
	public static String insertXml(Map<String,Object> map){
		String flage="false";
		
		Element persons = null;
		Element person = null;
        Element name = null;
        Element sex = null;
        
		
		try {
			//�õ�DOM�������Ĺ���ʵ��
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            //��DOM�����л��DOM������
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            //��Ҫ������xml�ĵ�����DOM������
            Document doc = dbBuilder.parse("E:/longdada.xml");
            //�õ��ĵ�����ΪStudent��Ԫ�صĽڵ��б�
            NodeList nList = doc.getElementsByTagName("persons");
            persons = (Element)nList.item(0);
            //��������Ϊperson��Ԫ��
            person = doc.createElement("person");
            //����Ԫ��Student������ֵΪ231
            person.setAttribute("id", "3");
            
            //��������Ϊname��Ԫ��
            name = doc.createElement("name");
            //��������Ϊ ���� ���ı��ڵ㲢��Ϊ�ӽڵ���ӵ�nameԪ����
            name.appendChild(doc.createTextNode("����"));
            
            //��������ΪName��Ԫ��
            sex = doc.createElement("sex");
            //��������Ϊ ����Ů ���ı��ڵ㲢��Ϊ�ӽڵ���ӵ�sexԪ����
            sex.appendChild(doc.createTextNode("����Ů"));
            //��name��Ԫ����ӵ�student��
            person.appendChild(name);
            person.appendChild(sex);
            
            
            //��person��Ϊ��Ԫ����ӵ����ĸ��ڵ�persons
            persons.appendChild(person);
            //���ڴ��е��ĵ�ͨ���ļ�������insertSchool.xml,XmlDocumentλ��crison.jar��
          //  ((XmlDocument)doc).write(new FileOutputStream("E:/longdada.xml"));
            System.out.println("�ɹ�");
			
            flage="true";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flage;
	}
	
	
	public static void main(String[] args) {
		//===========���Խ���������xml�ļ���
//		List<Map<String,Object>> maplist=new ArrayList<Map<String,Object>>();
//		for(int i=0;i<3;i++){
//			Map map=new HashMap<String,Object>();
//			map.put("name", "С��"+i);
//			map.put("age", "12"+i);
//			map.put("sex", "Ů"+i);
//			maplist.add(map);
//		}
//		buildWriteToXml(maplist, "students", "per");
		//====================���Խ����ݴ�xml����
		List<Map<String,Object>> maplist=new ArrayList<Map<String,Object>>();
		Map<String,Object> map=new HashMap<String, Object>();
		Map<String,Object> parms=new HashMap<String,Object>();
		map.put("firstElement","per");
		
		parms.put("name","name");
		parms.put("age","age");
		parms.put("sex","sex");
		map.put("parms",parms);
		
		queryFromXml(map);
		//insertXml();
	}
 
}
