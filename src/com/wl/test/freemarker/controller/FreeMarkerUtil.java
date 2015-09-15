package com.wl.test.freemarker.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreeMarkerUtil {
  //templatePathģ���ļ����·��
  //templateName ģ���ļ�����
  //filename ���ɵ��ļ�����
  public static void analysisTemplate(String templatePath,String templateName,String fileName,Map<?,?>root){
  try {
     Configuration config=new Configuration();
    //����Ҫ������ģ�����ڵ�Ŀ¼��������ģ���ļ�
    config.setDirectoryForTemplateLoading(new File(templatePath));
     //���ð�װ�������������װΪ����ģ��
     config.setObjectWrapper(new DefaultObjectWrapper());
     
   //��ȡģ��,�����ñ��뷽ʽ������������Ҫ��ҳ���еı����ʽһ��
   //������������
  Template template=config.getTemplate(templateName,"UTF-8");
     //�ϲ�����ģ����ģ��
     FileOutputStream fos = new FileOutputStream(fileName);
     Writer out = new OutputStreamWriter(fos,"UTF-8");
        template.process(root, out);
        out.flush();
        out.close();
    } catch (IOException e) {
     e.printStackTrace();
    }catch (TemplateException e) {
     e.printStackTrace();
    }
   }
}
