# Assignment-3-Inheritance
This is an Java project describes about java inheritance property.
it has 5 classes namely Hospital, HospitalEmployee, Nurse, Doctor and Surgeon
Hospital class consists of main method and objects created for other 4 classes and it invokes methods present in that particular class
HospitalEmployee class consists of basic details such name and id of an employee and using the getter and setter method we have intialize the values and it acts as an parent class for doctor and nurse class.
Nurse class is an subclass and it inherits the properities of parent class(HospitalEmployee)such as name and id, nurse class describes about the total number of patienths assigned to an paritcular nurse.
doctor class is an child class for HospitalEmployee class, Doctor class specifys the speciality of an doctor along with the doctor name and id.
Surgeon class is a subclass of doctor class and it describes the whether the doctor is operating or no.
the four class has common method named as work(), it is overridden in each class with differnt values and invoked in main method in Hospital class.
