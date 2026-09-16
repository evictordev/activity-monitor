package monitor.service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActivityService {

    public void registrarAtividade() {

        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dataHora = agora.format(formato);

        try (FileWriter arquivo = new FileWriter("historico.txt", true)) {

            arquivo.write(dataHora + "\n");

            System.out.println("Atividade registrada: " + dataHora);

        } catch (IOException erro) {

            System.out.println("Erro ao registrar atividade.");
            erro.printStackTrace();
        }
    }
}