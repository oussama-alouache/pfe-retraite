package com.example.Rc.Rc.data.common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component

public class LogsService  {
    @Autowired
    private LogsRepository repository;

    @EventListener
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        String H = String.valueOf(LocalDateTime.now().getHour());
        String M = String.valueOf(LocalDateTime.now().getMinute());
        UserDetails userDetails = (UserDetails) event.getAuthentication().getPrincipal();
        String username = userDetails.getUsername();

        Logs newLogs = new Logs();
        newLogs.setUsername(username);
        newLogs.setYeur(LocalDateTime.now().getYear());
        newLogs.setMounth(LocalDateTime.now().getMonthValue());
        newLogs.setDays(LocalDateTime.now().getDayOfMonth());
        newLogs.setHeurs( H + ":" + M);

        repository.save(newLogs);
    }


}
