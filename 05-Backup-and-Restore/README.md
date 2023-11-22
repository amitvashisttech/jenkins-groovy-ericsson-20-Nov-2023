## Backup 

####   -> Manage Jenkins -> Manage Plugin -> ThinBackup -> Install Plugin.
  
####   -> Manage Jenkins -> ThinBackup -> 
      Create a BackUp DIR : mkdir -p /var/jenkins_home/jenkins-backup ; chmod 777 -R /var/jenkins_home/jenkins-backup
      Backup Dir : /var/jenkins_home/jenkins-backup
```	  
	  Backup schedule for full backups:  05 12 * * *
	  Backup schedule for differential backups: 0 15 * * 1-5
	  Max number of backup sets: 5
	  Files excluded from backup: ^.*\.(log)$
	  Select all - excluded the below
	   - Backup config-history folder
           - Backup additional files
           - Clean up differential backups
```
