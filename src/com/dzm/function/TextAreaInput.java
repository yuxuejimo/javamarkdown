package com.dzm.function;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.dzm.gui.MarkDown;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/*
 * �ο���ҳ��
 * ������http://blog.csdn.net/alanzyy/article/details/48628991
 * ������¼���https://segmentfault.com/q/1010000007315258/a-1020000007321226
 */
public class TextAreaInput {
	
	@FXML
	private TextArea input_content;
	
	@FXML
	public void operat_input(KeyEvent event) throws Exception{
		if(event.isControlDown() && event.getCode()==KeyCode.S){
			System.out.println("ctrl+s");
			System.out.println(input_content.getId());
			FileChooser fileChooser1 = new FileChooser();
			fileChooser1.setTitle("Save File");
			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("MarkDown files (*.md)", "*.md");
            fileChooser1.getExtensionFilters().add(extFilter);
            File file = fileChooser1.showSaveDialog(new MarkDown().getMainStage());
            
            PrintStream ps = new PrintStream(new FileOutputStream(file));  
            ps.println(input_content.getText());// ���ļ���д���ַ���  
            ps.flush();
            ps.close();
		}
	}
	
}
