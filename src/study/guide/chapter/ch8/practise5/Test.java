package study.guide.chapter.ch8.practise5;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("berk", 24);
		var res = person.makeSomethingToThis(u-> {
			u.name =  u.name.replace("ber", "mer");
			return u;
		});
		System.out.println(res.toString());
		
		/*******************************************************************************************/
		
		
		Functional<Person, Person> delege = PersonHelper::staticMetod;
		Person person2 = new Person("deneme", 22);
		var res2 = person2.makeSomethingToThis(delege);
		System.out.println(res2);
		
		/*******************************************************************************************/
		
		Functional<Person, Person> functional = Person::new;
		
	}
}
