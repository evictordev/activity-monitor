package monitor.service;
import monitor.repository.FileActivityRepository;
import monitor.util.FormatDate;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActivityService {
	
	private FileActivityRepository repository;
	public ActivityService(){
		repository = new FileActivityRepository();	
	}
	
	FormatDate formatDate = new FormatDate();
	
	
    public void registrarAtividade() {

        LocalDateTime agora = LocalDateTime.now();

        String dataHora = formatDate.format(agora);
        
        repository.fileActivity(dataHora);
        
    }
}