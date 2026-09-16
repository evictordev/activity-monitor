package monitor.repository;

import java.io.FileWriter;
import java.io.IOException;

public class FileActivityRepository {
	public void fileActivity(String dataHora){
		try (FileWriter arquivo = new FileWriter("historico.txt", true)) {

            arquivo.write(dataHora + "\n");

            System.out.println("Atividade registrada: " + dataHora);

        } catch (IOException erro) {

            System.out.println("Erro ao registrar atividade.");
            erro.printStackTrace();
        }
	}
	
}
