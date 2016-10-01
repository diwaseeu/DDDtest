package com.Vmetry.NTL.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class reportoptimizer {
	@Test
	public static void archievefiles() throws IOException
	{
		SimpleDateFormat DF =new SimpleDateFormat("YYYY-MM-DD-HH-MM-SS-mm");
		String name = DF.format(new Date());
		File scrDir = new File ("C:\\seleniumWorkspace\\dddTEST\\Screenshots");
		File destDir = new File("C:\\seleniumWorkspace\\dddTEST\\Archievedfile\\"+"old_"+ name);
		FileUtils.copyDirectory(scrDir, destDir);
	}
	
	
	

}
