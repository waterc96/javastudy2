/**
 * 
 */
package io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CalculateRows {
   static long classcount = 0; // Java�������
   static long normalLines = 0; // ����
   static long commentLines = 0; // ע����
   static long writeLines = 0; // ������
   static long allLines = 0; // ������

   public static void main(String[] args) throws Exception {
       File f = new File("G:\\javaee\\new_javajc\\bin\\data_structre"); // Ŀ¼
       String type = ".java";//����ʲô���͵Ĵ��룬��".java"���ǲ�����java�����Ĵ�������".php"���ǲ�����PHP�����Ĵ�����
       CalculateRows.treeFile(f,type);
       System.out.println("·����" + f.getPath());
       System.out.println(type+"��������" + classcount);
       System.out.println("����������" + writeLines);
       System.out.println("ע��������" + commentLines);
       System.out.println("����������" + normalLines);
       if(classcount==0){
           System.out.println("����ƽ������:" + 0);
       }else{
           System.out.println("����ƽ������:" + writeLines / classcount);
       }
       System.out.println("�� ��������" + allLines);
   }

   /**
    * ���ҳ�һ��Ŀ¼�����е�.java�ļ�
    * @throws Exception
    */

   public static void treeFile(File f,String type) throws Exception {
       File[] childs = f.listFiles();
       for (int i = 0; i < childs.length; i++) {
           File file = childs[i];
           if (!file.isDirectory()) {
               if (file.getName().endsWith(type)) {
                   classcount++;
                   BufferedReader br = null;
                   boolean comment = false;
                   br = new BufferedReader(new FileReader(file));
                   String line = "";
                   while ((line = br.readLine()) != null) {
                       allLines++;
                       line = line.trim();
                       if (line.matches("^[//s&&[^//n]]*$")) {//��һ��ƥ���Կո�ͷ���������Իس�����ͷ�����Իس�����β
                           normalLines++;
                       } else if (line.startsWith("/*")
                               && !line.endsWith("*/")) {//ƥ����/*......*/��ס�Ķ���ע��
                           commentLines++;
                           comment = true;
                       } else if (true == comment) {
                           commentLines++;
                           if (line.endsWith("*/")) {
                               comment = false;
                           }//ƥ����//��ͷ�ĵ���ע�ͣ�����/*......*/��ס�ĵ���ע��
                       } else if (line.startsWith("//") || (line.startsWith("/*")&&line.endsWith("*/"))) {
                           commentLines++;
                       } else {//�����ľ��Ǵ�����
                           writeLines++;
                       }
                   }
                   if (br != null) {
                       br.close();
                       br = null;
                   }
               }
           } else {
               treeFile(childs[i],type);
           }
       }
   }
}

