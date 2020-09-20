package com.example.zoda;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "ShowResult";
    ProgressDialog progressDialog;
    Button button;

     String[] zodiac_sign(String name,int day, String month)
    {
        String astro_sign="";
        String phrase = "";
        String element = "";
        String traits = "";
        String info = "";
        String warnInfo = "Hello "+name+",";
        String astroInfo[] = new String [6];


        if (day<1)
        { month="";}
        boolean a = day<=31;
        boolean b = day<=30;

        if (month.equals("december") && a){

            if (day < 22) {
                astro_sign = "Sagittarius";
                phrase = "I aim";
                element = "Fire";
                info="November 20-December 21";
                traits = "Strengths: generous, idealistic, great sense of humor\n\n" +
                        "Weaknesses: promises more than can deliver, very impatient, will say anything no matter how undiplomatic";
            }
            else {
                astro_sign ="capricorn";
                phrase = "I use";
                element = "Earth";
                info="December 22-January 19";
                traits = "Strengths: responsible, disciplined, self-control, good managers\n\n" +
                        "Weaknesses: know-it-all, unforgiving, condescending, expecting the worst\n";
            }
        }

        else if (month.equals("january") && a){
            if (day < 20) {
                astro_sign = "Capricorn";
                phrase = "I use";
                element = "Earth";
                info="December 22-January 19";
                traits = "Strengths: responsible, disciplined, self-control, good managers\n\n" +
                        "Weaknesses: know-it-all, unforgiving, condescending, expecting the worst\n";
            }
            else {
                astro_sign = "aquarius";
                phrase = "I know";
                element = "Air";
                info="January 20-February 18";
                traits = "Strengths: Progressive, original, independent, humanitarian\n\n" +
                        "Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n";
            }
        }

        else if (month.equals("february") && day<=29){
            if (day < 19) {
                astro_sign = "Aquarius";
                phrase = "I know";
                element = "Air";
                info="January 20-February 18";
                traits = "Strengths: Progressive, original, independent, humanitarian\n\n" +
                        "Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n";
            }
            else {
                astro_sign = "pisces";
                phrase = "I believe";
                element = "Water";
                info="February 19-March 20";
                traits = "Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n\n" +
                        "Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n";
            }
        }

        else if(month.equals("march") && a){
            if (day < 21) {
                astro_sign = "Pisces";
                phrase = "I believe";
                element = "Water";
                info="February 19-March 20";
                traits = "Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n\n" +
                        "Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n";
            }
            else {
                astro_sign = "aries";
                phrase = "I am";
                element = "Fire";
                info="March 21-April 19";
                traits = "Strengths: courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n\n" +
                        "Weaknesses: impatient, moody, short-tempered, impulsive, aggressive\n";
            }
        }
        else if (month.equals("april") && b){
            if (day < 20) {
                astro_sign = "Aries";
                phrase = "I am";
                element = "Fire";
                info="March 21-April 19";
                traits = "Strengths: courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n\n" +
                        "Weaknesses: impatient, moody, short-tempered, impulsive, aggressive\n";
            }
            else {
                astro_sign = "taurus";
                phrase = "I have";
                element = "Earth";
                info="April 20-May 20";
                traits = "Strengths: reliable, patient, practical, devoted, responsible, stable\n\n" +
                        "Weaknesses: stubborn, possessive, uncompromising\n";
            }
        }

        else if (month.equals("may") && a){
            if (day < 21) {
                astro_sign = "Taurus";
                phrase = "I have";
                element = "Earth";
                info="April 20-May 20";
                traits = "Strengths: reliable, patient, practical, devoted, responsible, stable\n\n" +
                        "Weaknesses: stubborn, possessive, uncompromising\n";
            }
            else {
                astro_sign = "gemini";
                phrase = "I think";
                element = "Air";
                info="May 21-June 20";
                traits = "Strengths: gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n\n" +
                        "Weaknesses: nervous, inconsistent, indecisive\n";
            }
        }

        else if( month.equals("june") && b){
            if (day < 21) {
                astro_sign = "Gemini";
                phrase = "I think";
                element = "Air";
                info="May 21-June 20";
                traits = "Strengths: gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n\n" +
                        "Weaknesses: nervous, inconsistent, indecisive\n";
            }
            else {
                astro_sign = "cancer";
                phrase = "I feel";
                element = "Water";
                info="June 21-July 22";
                traits = "Strengths: tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n\n" +
                        "Weaknesses: moody, pessimistic, suspicious, manipulative, insecure\n";
            }
        }

        else if (month.equals("july") && a) {
            if (day < 23) {
                astro_sign = "Cancer";
                phrase = "I feel";
                element = "Water";
                info="June 21-July 22";
                traits = "Strengths: tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n\n" +
                        "Weaknesses: moody, pessimistic, suspicious, manipulative, insecure\n";
            }
            else {
                astro_sign = "leo";
                phrase = "I will";
                element = "Fire";
                info="July 23-August 22";
                traits = "Strengths: creative, passionate, generous, warm-hearted, cheerful, humorous\n\n" +
                        "Weaknesses: arrogant, stubborn, self-centered, lazy, inflexible\n";
            }
        }

        else if( month.equals("august") && a){
            if (day < 23) {
                astro_sign = "Leo";
                phrase = "I will";
                element = "Fire";
                info="July 23-August 22";
                traits = "Strengths: creative, passionate, generous, warm-hearted, cheerful, humorous\n\n" +
                        "Weaknesses: arrogant, stubborn, self-centered, lazy, inflexible\n";
            }
            else {
                astro_sign = "virgo";
                phrase = "I analyze";
                element = "Earth";
                info="August 23-September 22";
                traits = "Strengths: loyal, analytical, kind, hardworking, practical\n\n" +
                        "Weaknesses: shyness, worry, overly critical of self and others, all work and no play\n";
            }
        }

        else if (month.equals("september") && b){
            if (day < 23) {
                astro_sign = "Virgo";
                phrase = "I analyze";
                element = "Earth";
                info="August 23-September 22";
                traits = "Strengths: loyal, analytical, kind, hardworking, practical\n\n" +
                        "Weaknesses: shyness, worry, overly critical of self and others, all work and no play\n";
            }
            else {
                astro_sign = "libra";
                phrase = "I balance";
                element = "Air";
                info="September 23-October 22";
                traits = "Strengths: cooperative, diplomatic, gracious, fair-minded, social\n\n" +
                        "Weaknesses: indecisive, avoids confrontations, will carry a grudge, self-pity\n";
            }
        }

        else if (month.equals("october") && a){
            if (day < 23) {
                astro_sign = "Libra";
                phrase = "I balance";
                element = "Air";
                info="September 23-October 22";
                traits = "Strengths: cooperative, diplomatic, gracious, fair-minded, social\n\n" +
                        "Weaknesses: indecisive, avoids confrontations, will carry a grudge, self-pity\n";
            }
            else {
                astro_sign = "scorpio";
                phrase = "I want";
                element = "Water";
                info="October 23-November 21";
                traits = "Strengths: resourceful, brave, passionate, stubborn, a true friend\n\n" +
                        "Weaknesses: distrusting, jealous, secretive, violent\n";
            }
        }

        else if (month.equals("november") && b){
            if (day < 22) {
                astro_sign = "scorpio";
                phrase = "I want";
                element = "Water";
                info="October 23-November 21";
                traits = "Strengths: resourceful, brave, passionate, stubborn, a true friend\n\n" +
                        "Weaknesses: distrusting, jealous, secretive, violent\n";
            }
            else {
                astro_sign = "sagittarius";
                phrase = "I aim";
                element = "Fire";
                info="November 20-December 21";
                traits = "Strengths: generous, idealistic, great sense of humor\n\n" +
                        "Weaknesses: promises more than can deliver, very impatient, will say anything no matter how undiplomatic";
            }
        }

        else {
            warnInfo = "OOPS!!! Looks like, you have entered a invalid date of birth.\n\nPlease re-enter your date of birth and try again.";
        }


        if(astro_sign.isEmpty()){
            astroInfo[0] = "";
            astroInfo[1] = "";
            astroInfo[2] = "";
            astroInfo[3] = "";
            astroInfo[4] = "";
            astroInfo[5] = warnInfo;
        }


         else{

            astroInfo[0] = "Zodiac \t: " + astro_sign.toUpperCase();
            astroInfo[1] = "Key-phrase \t: " + '"' + phrase + '"';
            astroInfo[2] = "Element \t: " + element;
            astroInfo[3] = "Traits \t: \n" + traits;
            astroInfo[4] = "Date Range \t: \n" + info;
            astroInfo[5] = warnInfo;
        }



            return astroInfo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showIt(view);
            }

            public void showIt (View v) {
                EditText editText1 = findViewById(R.id.name);
                EditText editText2 = findViewById(R.id.day);
                EditText editText3 = findViewById(R.id.month);
                String tempName = editText1.getText().toString().trim();
                int tempDay=0;
                if(!editText2.getText().toString().equals(""))
                {tempDay =Integer.parseInt(editText2.getText().toString());}
                String tempMonth = editText3.getText().toString().toLowerCase().trim();
                final String zodiacSign [] = zodiac_sign(tempName,tempDay,tempMonth);

                progressDialog = new ProgressDialog(MainActivity.this);

                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
                progressDialog.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Thread timer = new Thread(){
                    @Override
                    public void run(){


                        try{
                            sleep(500);
                            Intent intent = new Intent(getApplicationContext(),printZodiacActivity.class);
                            intent.putExtra(MSG,zodiacSign);
                            startActivity(intent);
                            //Toast.makeText(MainActivity.this,"processing...",Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                            super.run();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                };
                timer.start();
            }
        });
        }

}