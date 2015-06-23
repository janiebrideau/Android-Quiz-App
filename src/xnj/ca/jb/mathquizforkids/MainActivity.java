package xnj.ca.jb.mathquizforkids;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	
	
	private int currentQuestion;
	private String[] questions;
	private String[] answers;
	private Button answerButton;
	private Button questionButton;
	private TextView questionView;
	private TextView answerView;
	private EditText answerText;
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    
    
    public void init()
    {
    questions = new String[]{"1*0","1*1","1*2","1*3","1*4","1*5","1*6","1*7","1*8","1*9","1*10","1*11","1*12",
    						 "2*0","2*1","2*2","2*3","2*4","2*5","2*6","2*7","2*8","2*9","2*10","2*11","2*12",
    						 "3*0","3*1","3*2","3*3","3*4","3*5","3*6","3*7","3*8","3*9","3*10","3*11","3*12",
    						 "4*0","4*1","4*2","4*3","4*4","4*5","4*6","4*7","4*8","4*9","4*10","4*11","4*12",
    						 "5*0","5*1","5*2","5*3","5*4","5*5","5*6","5*7","5*8","5*9","5*10","5*11","5*12",
    						 "5*0","5*1","5*2","5*3","5*4","5*5","5*6","5*7","5*8","5*9","5*10","5*11","5*12",
    						 "6*0","6*1","6*2","6*3","6*4","6*5","6*6","6*7","6*8","6*9","6*10","6*11","6*12",
    						 "7*0","7*1","7*2","7*3","7*4","7*5","7*6","7*7","7*8","7*9","7*10","7*11","7*12",
    						 "8*0","8*1","8*2","8*3","8*4","8*5","8*6","8*7","8*8","8*9","8*10","8*11","8*12",
    						 "9*0","9*1","9*2","9*3","9*4","9*5","9*6","9*7","9*8","9*9","9*10","9*11","9*12",
    						 "10*0","10*1","10*2","10*3","10*4","10*5","10*6","10*7","10*8","10*9","10*10","10*11","10*12",
    						 "11*0","11*1","11*2","11*3","11*4","11*5","11*6","11*7","11*8","11*9","11*10","11*11","11*12",
    						 "12*0","12*1","12*2","12*3","12*4","12*5","12*6","12*7","12*8","12*9","12*10","12*11","12*12"};
   
    answers = new String[]{"0","1","2","3","4","5","6","7","8","9","10","11","12",
    					   "0","2","4","6","8","10","12","14","16","18","20","22","24",
    					   "0","3","6","9","12","15","18","21","24","27","30","33","36",
    					   "0","4","8","12","16","20","24","28","32","36","40","44","48",
    					   "0","5","10","15","20","25","30","35","40","45","50","55","55",
    					   "0","6","12","18","24","30","36","42","48","54","60","66","72",
    					   "0","7","14","21","28","35","42","49","56","63","77","77","84",
    					   "0","8","16","24","32","40","48","56","64","72","80","88","96",
    					   "0","9","18","27","36","45","54","63","72","81","90","99","108",
    					   "0","10","20","30","40","50","60","70","80","90","100","110","120",
    					   "0","11","22","33","44","55","66","77","88","99","110","121","132",
    					   "0","12","24","36","48","60","72","84","96","108","120","132","144"};
    currentQuestion = -1;
    answerButton = (Button)findViewById(R.id.answerButton);
    questionButton = (Button)findViewById(R.id.questionButton);
    questionView = (TextView)findViewById(R.id.questionTextView);
    answerView = (TextView)findViewById(R.id.answerTextView);
    answerText = (EditText)findViewById(R.id.answerText);

    answerButton.setOnClickListener(new OnClickListener(){
    	@Override
    public void onClick(View v){ checkAnswer();
    	}});
    questionButton.setOnClickListener(new OnClickListener(){
    public void onClick(View v){ showQuestion();
    	}});
    }
    
    public void showQuestion()
    {
    	currentQuestion++;
    	if(currentQuestion == questions.length)
    		currentQuestion =0;
    	
    	questionView.setText(questions[currentQuestion]);
    	answerView.setText("");
    	answerText.setText("");
        	
    }
    public boolean isCorrect(String answer)
    {
    	return (answer.equalsIgnoreCase(answers[currentQuestion]));
    }

    public void checkAnswer()
    {
    	String answer = answerText.getText().toString();
    	if(isCorrect(answer))
    		answerView.setText("Right answer!");
    	else 
    		answerView.setText("Sorry, the correct answer is: "+answers[currentQuestion]);
    	
    }
    
    
}



   