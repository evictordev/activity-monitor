package monitor;

import monitor.service.ActivityService;

public class ActivityMonitor {
    public static void main(String[] args) {

        System.out.println("Monitor de atividade iniciado!");

        ActivityService activityService = new ActivityService();

        activityService.registrarAtividade();
    }
}