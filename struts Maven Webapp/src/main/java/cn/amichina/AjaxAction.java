package cn.amichina;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ClassLoaderUtil;

public class AjaxAction extends ActionSupport {

	private InputStream inputStream;

	@Override
	public String execute() throws Exception {
		inputStream = new ByteArrayInputStream("this is responsed by ajax".getBytes("utf-8"));
		return SUCCESS;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	
}
