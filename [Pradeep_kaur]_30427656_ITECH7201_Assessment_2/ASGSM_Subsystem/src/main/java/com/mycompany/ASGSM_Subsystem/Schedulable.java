package com.mycompany.ASGSM_Subsystem;

import java.time.LocalDateTime;

public interface Schedulable {
    LocalDateTime getScheduledTime();
    void setScheduledTime(LocalDateTime scheduledTime);
}
