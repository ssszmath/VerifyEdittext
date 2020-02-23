#VerifyEdittext#

Android Library For coming Verify Code instance of Edittext
Use and Enjoy



Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.ssszmath:VerifyEdittext:1.0.0'
	}
	

How to User

add below code in xml layout

	<ir.s.s.verifyet.VerifyEdittext
	android:id="@+id/verify_et"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

Mange VerifyEdittext In Activity For Example : 


    public class MainActivity extends AppCompatActivity {

    VerifyEdittext verify_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verify_et=findViewById(R.id.verify_et);




        verify_et.setTextSize(36);

    }
    }
