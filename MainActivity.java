package com.example.dell.awsexample;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.*;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.services.s3.model.StaticEncryptionMaterialsProvider;
import java.sql.Time;
import android.view.View.OnClickListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.lang.Math;
import static android.R.id.input;

public class MainActivity extends AppCompatActivity {
    int hours = new Time(System.currentTimeMillis()).getHours();
    public Context applicationContext;
    CognitoCachingCredentialsProvider credentialsProvider;
    AmazonDynamoDBClient ddbClient;

    String identityId;
  
    int logged;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        public EditText NapTime=(EditText) findViewById(R.id.nap_time);
        public EditText FeedTime=(EditText) findViewById(R.id.feed_time);
        Button Button1=(Button) findViewById(R.id.button1);
        
        logged=func();
        
        credentialsProvider = new CognitoCachingCredentialsProvider(
            applicationContext, // get the context for the current activity
            "us-west-2_zG713i4td", // Identity Pool ID
            Regions.US_WEST_2 //Region
        );
        ddbClient = new AmazonDynamoDBClient(credentialsProvider);
        identityId=credentialsProvider.getIdentityId();
        
        Button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                if(!TextUtils.isEmpty(NapTime.getText().toString)&&!TextUtils.isEmpty(FeedTime.getText().toString)){
                    int NapTime1= Integer.parseInt(NapTime.getText().toString());
                    int FeedTime1= Integer.parseInt(FeedTime.getText().toString());
                    if((NapTime1-hours)==1)
                    {
                        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                        String MyText = "Time to put the baby to sleep";
                        Notification mNotification = new Notification(R.drawable.notification_icon, MyText, System.currentTimeMillis() );

                    }
                    if((FeedTime1-hours)==1)
                    {
                        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                        String MyText1 = "Time to feed the baby";
                        Notification mNotification = new Notification(R.drawable.notification_icon, MyText1, System.currentTimeMillis() );

                    }
                }

            }
        });

    }
    
     public int func()
    {
       if(identityId!=null){
           Log.d("LogTag", "my ID is " + identityId);
       }
       return 0;
    }

}
