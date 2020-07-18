package com.syntax.class21;

public class TestTeacher {
	public static void main (String [] args) {
		Teacher obj = new Teacher();
		obj.numOfYears=20;
		obj.degree=true;
		obj.name="Parent";
		obj.lastName="Teacher";
		obj.type="many";
		
		obj.passionate();
		obj.hardWorking();
		
		MathTeacher obj1 = new MathTeacher();
		obj1.numOfYears=35;
		obj1.degree=true;
		obj1.name="Donald";
		obj1.lastName="Duch";
		obj1.type="Mathamatics";
		obj1.nurd=true;
		
		obj1.greatWithnum();
		obj1.passionate();
		obj1.hardWorking();
		
		ChemistryTeacher obj2 = new ChemistryTeacher();
		obj2.numOfYears=10;
		obj2.degree=true;
		obj2.name="Mickey";
		obj2.lastName="Mouse";
		obj2.type="Chemistry";
		obj2.Lab="Lab work";
		obj2.periodoicTable=true;
		
		obj2.Practical();
		obj2.passionate();
		obj2.hardWorking();
		
		PianoTeacher obj3 = new PianoTeacher();
		obj3.numOfYears=40;
		obj3.degree=true;
		obj3.name="Minnie";
		obj3.lastName="Mouse";
		obj3.type="Music";
		obj3.hasPiano=true;
		obj.type="Piano";
		
		
		obj3.musicalNotes();
		obj3.passionate();
		obj3.hardWorking();
		
	}

}
