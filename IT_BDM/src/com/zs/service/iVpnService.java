package com.zs.service;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public interface iVpnService {
	public void importExcelData(String fileName, File file) throws IOException, NumberFormatException, ParseException;
}
