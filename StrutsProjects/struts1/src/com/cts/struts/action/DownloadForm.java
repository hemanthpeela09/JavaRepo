package com.cts.struts.action;

import java.io.File;

import org.apache.struts.validator.ValidatorForm;

public class DownloadForm extends ValidatorForm
{
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
}
