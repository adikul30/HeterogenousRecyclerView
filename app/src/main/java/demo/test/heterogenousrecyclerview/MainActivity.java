package demo.test.heterogenousrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
	
	RecyclerView recyclerView;
	TimetableAdapter timetableAdapter;
	ArrayList<Object> arrayList = new ArrayList<>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		dummyData();
		recyclerView = (RecyclerView) findViewById(R.id.timetableRecyclerView);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		timetableAdapter = new TimetableAdapter(arrayList, this);
		recyclerView.setAdapter(timetableAdapter);
	}
	
	private void dummyData()
	{
		arrayList.add(new LecturesModel("OS", "Name Surname", "9:00", "CR1"));
		arrayList.add(new LecturesModel("Networks", "Name Surname", "10:00", "CR1"));
		arrayList.add(new LecturesModel("MicroProcessor", "Name Surname", "11:00", "CR1"));
		arrayList.add(new Practical_3("OS", "Networks", "MicroProcessor", "Name Surname", "Name Surname", "Name Surname", "12:30", "L1", "L2", "L3"));
		arrayList.add(new LecturesModel("OS", "Name Surname", "2:30", "CR1"));
		arrayList.add(new LecturesModel("Networks", "Name Surname", "3:30", "CR1"));
		arrayList.add(new Practical_4("OS", "Networks", "Microprocessor", "Web Development", "Name Surname", "Name Surname", "Name Surname", "tName Surname4", "12:30", "CR1", "CR2", "CR3", "CR4"));
		arrayList.add(new LecturesModel("OS", "Name Surname", "2:30", "CR1"));
		arrayList.add(new LecturesModel("Networks", "Name Surname", "3:30", "CR1"));
		arrayList.add(new Practical_5("OS", "Networks", "Microprocessor", "Web Development","IoT", "Name Surname", "Name Surname", "Name Surname", "Name Surname","Name Surname", "12:30", "CR1", "CR2", "CR3", "CR4","CR5"));
		arrayList.add(new LecturesModel("OS", "Name Surname", "2:30", "CR1"));
		arrayList.add(new LecturesModel("Networks", "Name Surname", "3:30", "CR1"));
		arrayList.add(new Practical_6("OS", "Networks", "Microprocessor", "Web Development","IoT","App Development", "Name Surname", "Name Surname", "Name Surname", "Name Surname","Name Surname","Name Surname", "12:30", "CR1", "CR2", "CR3", "CR4","CR5","CR6"));
		arrayList.add(new LecturesModel("OS", "Name Surname", "2:30", "CR1"));
		arrayList.add(new LecturesModel("Networks", "Name Surname", "3:30", "CR1"));
		
		
	}
}
