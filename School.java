
//71. School კლასი(2018 წლის გამოცდის ამოცანა).
//თქვენი მიზანია დაწეროთ School კლასი, რომლის საშუალებითაც შევძლებთ
//უნივერსიტეტის მართვას. კლასს უნდა ჰქონდეს კონსტრუქტორი და 5 public მეთოდი.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class School {
private HashMap<String, ArrayList<String>> teacherSubject; 
private HashMap<String, ArrayList<String>> pupilSubject; 	
private HashMap<String, ArrayList<String>> pupilsTeachers;
private HashMap<String, ArrayList<String>>  teachersPupils ; 
private ArrayList<String> teachers;
//private HashMap<String, String> teacherSubject; 
	
//	კონსტრუქტორს არაფერი არ გადაეცემა. აქ შეგიძლიათ ინიციალიზაცია გაუკეთოთ
//	თქვენთვის საჭირო ცვლადებს.
	public School() {
		  teacherSubject = new HashMap<String, ArrayList<String>>(); 
		  pupilSubject = new HashMap<String, ArrayList<String>>(); 
		   pupilsTeachers = new HashMap<String, ArrayList<String>>();
		   teachersPupils  = new HashMap<String, ArrayList<String>>();
		  teachers = new ArrayList<String>();
		  
	}
	
//	addTeacher მეთოდის საშუალებით შეგიძლიათ სკოლას დაამატოთ ახალი
//	მასწავლებელი. მეთოდს გადაეცემა მასწავლებლის სახელი. შეგიძლიათ ჩათვალოთ,
//	რომ მასწავლებლის სახელი უნიკალურია.
	public void addTeacher(String teacher) {
		if(!teachers.contains(teacher)) teachers.add(teacher);
		
		
	}
	
//	addSubject მეთოდის საშუალებით შეგიძლიათ მასწავლებელს დაუმატოთ საგანი.
//	მეთოდს გადაეცემა მასწავლებლის სახელი და საგნის სახელი. ჩათვალეთ, რომ საგნის
//	სახელი უნიკალურია. ერთი და იგივე მასწავლებელი შეიძლება რამდენიმე საგანს
//	კითხულობდეს, ასევე ერთსა და იმავე საგანს შეიძლება რამდენიმე მასწავლებელი
//	კითხულობდეს ერთდროულად.
//	თუკი teacher სახელის მქონე მასწავლებელი არ არის აქამდე დამატებული, მაშინ
//	მეთოდმა არაფერი არ უნდა გააკეთოს.
	public void addSubject(String teacher, String subject) {
		//if(teachers.contains(teacher)) teacherSubject.put(teacher, subject);
		teacherSubject.putIfAbsent(teacher, new ArrayList<String>());
		teacherSubject.get(teacher).add(subject);
		
	}
	
//	addPupil მეთოდის საშუალებით შეგიძლიათ საგანზე დაამატოთ მოსწავლე. ერთი და
//	იგივე მოსწავლე შეიძლება ერთ ან რამდენიმე საგანს სწავლობდეს.
	public void addPupil(String pupil, String subject) {
		pupilSubject.putIfAbsent(pupil, new ArrayList<String>());
		pupilSubject.get(pupil).add(subject);
		
		//pupilsTeachers
		
		String name = findTeacher(subject);
		pupilsTeachers.putIfAbsent(pupil, new ArrayList<String>());
		pupilsTeachers.get(pupil).add(name);
		
		
		teachersPupils.putIfAbsent(name,new ArrayList<String>());
		teachersPupils.get(name).add(pupil);
		
		
	}
	
private String findTeacher(String subject) {
		
	///????????????????????????????	
		for(String i : teacherSubject.keySet()){
			if(teacherSubject.get(i).contains(subject)){
				return i;
				
			}
			
		}
		return null;
	}

	//	getTeachers მეთოდს გადაეცემა მოსწავლის სახელი და მან უნდა დააბრუნოს ამ
//	მოსწავლის ყველა მასწავლებელზე იტერატორი. ანუ მხოლოდ იმ მასწავლებლების
//	სახელები, რომლებიც ასწავლიან იმ საგნებს, რომლებზეც მოსწავლეა
//	დამატებული(სწავლობს). თუკი pupil სახელის მოსწავლე არ გვყავს მაშინ მეთოდმა
//	უნდა დააბრუნოს null.
	public Iterator<String> getTeachers(String pupil){
		
		
		
		return pupilsTeachers.get(pupil).iterator();
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	getPupils მეთოდს გადაეცემა მასწავლებლის სახელი და მან უნდა დააბრუნოს ამ
//	მასწავლებლის ყველა სტუდენტზე იტერატორი. ანუ მხოლოდ იმ სტუდენტების
//	სახელები, რომლებიც მის რომელიმე საგანს სწავლობენ. თუკი teacher სახელის მქონე
//	ლექტორი არ გვყავს მაშინ მეთოდმა უნდა დააბრუნოს null.
	public Iterator<String> getPupils(String teacher){
		if(!teachers.contains(teacher)) return null;
		return teachersPupils.get(teacher).iterator() ;
	}
	


















	//	მეთოდმა უნდა წაშალოს მასწავლებლის შესახებ ყველა ინფორმაცია. ამ მეთოდის
//	გამოძახების, შემდეგ getTeachers მეთოდმა არ უნდა დააბრუნოს teacher სახელი არც
//	ერთი სტუდენტისთვის.
	public void removeTeacher(String teacher) {
		teachers.remove(teacher);
		
		
		for(String i : teacherSubject.keySet()){
			if(i.equals(teacher)){
				teacherSubject.remove(teacher);
			}
			
		}
		for(String i : pupilsTeachers.keySet()){
			if(pupilsTeachers.get(i).contains(teacher)){
				pupilsTeachers.get(i).remove(teacher);
			}
			
		}
		for(String i : teachersPupils.keySet()){
			if(teachersPupils.get(i).contains(teacher)){
				teachersPupils.get(i).remove(teacher);
			}
			
		}
		
		//pupilSubject
		
	}
	
}
