/**
 * 
 */
package br.com.fiap.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ManipulacaoArquivo {

	public static void main(String[] args) {

		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("config.properties");

			// set the properties value
			prop.setProperty("1","");
			prop.setProperty("nome", "Diego");
			prop.setProperty("telefone", "11 4444-444");
			prop.setProperty("id", "2");
			prop.setProperty("nome", "Diego");
			prop.setProperty("telefone", "11 4444-444");

			prop.setProperty("id", "1");
			prop.setProperty("nome", "Diego");
			prop.setProperty("telefone", "11 4444-444");

			prop.setProperty("id", "1");
			prop.setProperty("nome", "Diego");
			prop.setProperty("telefone", "11 4444-444");

			prop.setProperty("id", "1");
			prop.setProperty("nome", "Diego");
			prop.setProperty("telefone", "11 4444-444");

			prop.setProperty("id", "1");
			prop.setProperty("nome", "Diego");
			prop.setProperty("telefone", "11 4444-444");


			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
