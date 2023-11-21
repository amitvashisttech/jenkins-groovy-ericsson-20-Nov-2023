Jenkins Security 

1. Security -> Authentication 
                ->  Disable "Keep me signed in" 
				->  Allow users to sign up 
				
			   -> Login to incognito -> sign up -> 
                -> Now you can see the user has been added as admin & allow create & delete any job on Jenkins ( Wrong Security Practices ) 
				-> Disable the user sign up. 
		
            -> Install Security Plugin -> Install RBAC Plugin ( Role based Auth ) -> Install 
			   -> Manage Jenkins -> Security ->  Authorization -> Role Based Strategy  -> Save. 
			   
			   -> Manage Jenkins -> Security -> Manage Roles 
			
            -> Create User Manually 
                -> Manage Jenkins -> Users -> Tom -> Try to Login in incognito ->  ( tom is missing the Overall/Read permission ) 

            -> Create Roles 
			    -> Manage Jenkins -> Security -> Manage Roles ->Create a "ReadOnly-Role" -> Overall/Read
			
            -> Assign Role to a User 
                 -> Manage Jenkins -> Security -> Manage Roles -> Assign Roles -> Add user ( Tom ) -> Assign ( ReadOnly-Role ) 
                 -> Now login & Check, Now Jobs bz he is not authorized to a Job. 

			     -> Manage Jenkins -> Security -> Manage Roles -> Modify -> Enable Job Read as well -> Save.  
				 -> Now Check again with TOM. 

			-> Allow Role to Execute / Build the Jobs 	 
			     -> Manage Jenkins -> Security -> Manage Roles -> Modify -> Enable Job Read & Build as well -> Save.  
				 -> Now login & Check, Now Jobs users should be able to execute the jobs. 
			
				
            -> Restircts the User to Type of Jobs 
			     -> Create a Dev Role -> with over all read permission. 
				 -> Create a Ansible Role -> Item -> Name : Ansible , Patern : ansible-.*
				 -> Now Assigin Dev Role & Item ansible role to TOM User. 
				 -> Check User Should be only able to see ansible Jobs. 
				 
				 -> Add a backup item role as well & test. 
				 
