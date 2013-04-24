package com.my.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
	public String str="";
	Character op='q';
	float i;
	double temp;
	double num;
	EditText Reasult;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Reasult=(EditText)findViewById(R.id.ans);
	}

	public void btnadd(View v){
		perform();
		op='+';
	}
	public void btnminus(View v){
		perform();
		op='-';
	}
	public void btnmul(View v){
		perform();
		op='*';
	}
	public void btndiv(View v){
		perform();
		op='/';
	}
	public void btnmodule(View v){
		perform();
		op='%';
	}
	public void btnsquare(View v){
		perform();
		op='^';
	}
	public void btnroot(View  v){
		perform();
		op='r';
	} 
	public void btnequal(View v){
		equate();
	}
	public void btnclear(View v){
		 str ="";
		   op ='q';
		   num = 0;
		   temp = 0;
		   Reasult.setText("");
	}

	//public void btn+(View v){
	//	perform();
	//	op='+';
	//}
	public void btn1(View v){
		insert(1);
	}
	public void btn2(View v){
		insert(2);
	}
	public void btn3(View v){
		insert(3);
	}
	public void btn4(View v){
		insert(4);
	}
	public void btn5(View v){
		insert(5);
	}
	public void btn6(View v){
		insert(6);
	}
	
	public void btn7(View v){
		insert(7);
	}
	public void btn8(View v){
		insert(8);
	}
	public void btn9(View v){
		insert(9);
	}
	
	
	      private void equate(){
	    if(op == '+')
	     num = temp+num;
	    else if(op == '-')
	     num = temp-num;
	    else if(op == '/')
	     num = temp/num;
	    else if(op == '*')
	     num = temp*num;
	    else if(op=='^')
	    	num=num*num;
	    else if(op=='r')
	    	num=Math.sqrt(num);
	    Reasult.setText(""+num);
	   }
	     
	

private void perform() {
    str = "";
    temp = num;
   }
private void insert(int j) {
       str = str+Integer.toString(j);
       num = Integer.valueOf(str).intValue();
       Reasult.setText(str);
        
     
   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
