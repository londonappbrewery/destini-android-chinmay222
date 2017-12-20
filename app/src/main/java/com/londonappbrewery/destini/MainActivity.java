package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mButtonTop,mButtonBottom;
    TextView mStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final int [] Ends = {R.string.T6_End,R.string.T5_End,R.string.T4_End};
        final int []stories = {R.string.T1_Story,R.string.T2_Story,R.string.T3_Story};
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStory = (TextView)findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStory.setText(stories[2]);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBottom.setText(R.string.T3_Ans2);
                mButtonTop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mStory.setText(Ends[0]);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        
                    }
                });
                mButtonBottom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mStory.setText(Ends[1]);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                    }
                });

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStory.setText(stories[1]);
                mButtonTop.setText(R.string.T2_Ans1);
                mButtonBottom.setText(R.string.T2_Ans2);
                mButtonBottom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mStory.setText(Ends[2]);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                    }
                });

                mButtonTop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mStory.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        mButtonTop.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mStory.setText(Ends[0]);
                                mButtonTop.setVisibility(View.GONE);
                                mButtonBottom.setVisibility(View.GONE);
                            }
                        });
                        mButtonBottom.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                mStory.setText(Ends[1]);
                                mButtonTop.setVisibility(View.GONE);
                                mButtonBottom.setVisibility(View.GONE);
                            }
                        });



                    }
                });


            }
        });

    }
}
