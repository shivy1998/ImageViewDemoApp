package lockdown.org.imageviewdemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    ImageView iv;
    Button btnFirst, btnNext, btnPrevious, btnLast;
    int arr[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    int count=0;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.iv);
        btnFirst=findViewById(R.id.btnFirst);
        btnNext=findViewById(R.id.btnNext);
        btnPrevious=findViewById(R.id.btnPrevious);
        btnLast=findViewById(R.id.btnLast);
        iv.setImageResource(arr[count]);
        btnFirst.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                count = 0;
                iv.setImageResource(arr[count]);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(count == arr.length-1)
                {
                    Toast.makeText(MainActivity.this,"No more images to display",Toast.LENGTH_LONG).show();
                }
                else
                {
                    count++;
                    iv.setImageResource(arr[count]);
                }
            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                if(count == 0)
                {
                    Toast.makeText(MainActivity.this,"First Image",Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                    iv.setImageResource(arr[count]);
                }
            }
        });
        btnLast.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                count = arr.length-1;
                iv.setImageResource(arr[count]);
            }
        });

    }
}
