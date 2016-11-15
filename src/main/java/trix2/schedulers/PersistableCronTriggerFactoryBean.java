package trix2.schedulers;

import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

public class PersistableCronTriggerFactoryBean extends CronTriggerFactoryBean {

	@Override
	public void afterPropertiesSet() {
		try {
			super.afterPropertiesSet();
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Remove the JobDetail element
		getJobDataMap().remove("jobDetail");
	}
}