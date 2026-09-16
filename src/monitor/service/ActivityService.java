package monitor.service;
import monitor.repository.FileActivityRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActivityService {
	
	private FileActivityRepository repository;
	public ActivityService(){
		repository = new FileActivityRepository();	
	}
	
    public void registrarAtividade() {

        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dataHora = agora.format(formato);
        
        repository.fileActivity(dataHora);
        
    }
}