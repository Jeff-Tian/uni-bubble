# Copy your GUID that was created, in this case it's "ff-23-113-824e-5c5144ea".
C:\>bcdedit /copy {current} /d "No Hyper-V" 
The entry was successfully copied to {ff-23-113-824e-5c5144ea}. 

# Replace "ff-23-113-824e-5c5144ea" with the GUID generated from the above cmd.
C:\>bcdedit /set {ff-23-113-824e-5c5144ea} hypervisorlaunchtype off 
The operation completed successfully.