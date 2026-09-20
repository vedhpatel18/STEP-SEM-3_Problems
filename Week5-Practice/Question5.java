/* 
@author Vedh
*/
import java.util.*;
class Question5 implements Comparable<Question5>{
String name;
double cgpa;
int codingScore;
Question5(String name,double cgpa,int codingScore){
this.name=name;
this.cgpa=cgpa;
this.codingScore=codingScore;
}
static boolean isEligible(double cgpa){
return cgpa>=7.5;
}
static boolean isEligible(double cgpa,int codingScore){
return cgpa>=6.5&&codingScore>=60;
}
double compositeScore(){
return cgpa*10+codingScore/2.0;
}
public int compareTo(Question5 other){
return Double.compare(other.compositeScore(),compositeScore());
}
static String shortlistAndRank(Question5[] candidates){
ArrayList<Question5> list=new ArrayList<>();
for(Question5 candidate:candidates){
if(isEligible(candidate.cgpa)||isEligible(candidate.cgpa,candidate.codingScore))
list.add(candidate);
}
Question5[] shortlisted=list.toArray(new Question5[0]);
Arrays.sort(shortlisted);
String result="";
for(int i=0;i<shortlisted.length;i++){
result=result+(i+1)+". "+shortlisted[i].name+" ("+shortlisted[i].compositeScore()+")";
if(i<shortlisted.length-1)
result=result+" | ";
}
return result;
}

public static void main(String[] args){
Question5[] candidates={
new Question5("Aisha",8.2,40),
new Question5("Rohit",6.8,65),
new Question5("Meena",6.0,90),
new Question5("Karan",7.5,20)
};
System.out.println(shortlistAndRank(candidates));
}
}