/*
 * Copyright (C) 2016 teju <tejendersheoran@gmail.com>
 * See license file for more information
*/
package org.ykc.gutils;

import java.awt.Component;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FileUtils {

	public enum SaveOpen{
		SAVE,
		OPEN
	}

	public static File getFile(SaveOpen option, String extension) throws CancelledException
	{
		String fileName;
		JFileChooser chooser;

        FileNameExtensionFilter filter = new FileNameExtensionFilter(extension.toUpperCase() + " Format ("+ extension + ")", extension);

        chooser = new JFileChooser();
        if(option == SaveOpen.SAVE)
        {
            chooser.setDialogTitle("Saving Data");
        }
        else
        {
            chooser.setDialogTitle("Open File");
        }

        chooser.setFileFilter(filter);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        int rval;
        if(option == SaveOpen.SAVE)
        {
            rval = chooser.showSaveDialog((Component)null);
        }
        else
        {
        	rval = chooser.showOpenDialog((Component)null);
        }


        if(rval == JFileChooser.APPROVE_OPTION) {
        	fileName = chooser.getSelectedFile().getAbsolutePath();
        	fileName = fileName + ".uc";
        	File x = new File(fileName);
        	return x;
        }
        throw new CancelledException();
	}

	@SuppressWarnings("serial")
	public static class CancelledException extends IOException
	{

	}

}
