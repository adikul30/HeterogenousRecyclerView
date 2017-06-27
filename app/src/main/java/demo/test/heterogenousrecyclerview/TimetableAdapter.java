package demo.test.heterogenousrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by adicool on 24/6/17.
 */

public class TimetableAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
	
	private final int LECTURE = 1;
	private final int PRACTICAL3 = 2;
	private final int PRACTICAL4 = 3;
	private final int PRACTICAL5 = 4;
	private final int PRACTICAL6 = 5;
	private ArrayList<Object> mArrayList;
	private Context mContext;
	
	
	public TimetableAdapter(ArrayList<Object> arrayList, Context context)
	{
		mArrayList = arrayList;
		mContext = context;
	}
	
	@Override
	public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		
		View itemView;
		
		if (viewType == PRACTICAL3)
		{
			itemView = LayoutInflater.from(mContext).inflate(R.layout.practical_3, parent, false);
			return new PracticalViewHolder_3(itemView);
		}
		else if(viewType == PRACTICAL4)
		{
			itemView = LayoutInflater.from(mContext).inflate(R.layout.practical_4, parent, false);
			return new PracticalViewHolder_4(itemView);
		}
		else if(viewType == PRACTICAL5)
		{
			itemView = LayoutInflater.from(mContext).inflate(R.layout.practical_5, parent, false);
			return new PracticalViewHolder_5(itemView);
		}
		else if(viewType == PRACTICAL6)
		{
			itemView = LayoutInflater.from(mContext).inflate(R.layout.practical_6, parent, false);
			return new PracticalViewHolder_6(itemView);
		}
		else
		{
			itemView = LayoutInflater.from(mContext).inflate(R.layout.lecture_list_item, parent, false);
			return new LectureViewHolder(itemView);
		}
	}
	
	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
	{
		if (holder.getItemViewType() == PRACTICAL3)
		{
			
			Practical_3 practicalsModel = (Practical_3) mArrayList.get(position);
			PracticalViewHolder_3 pvh_3 = (PracticalViewHolder_3) holder;
			pvh_3.practicalTime.setText(practicalsModel.getTime());
			pvh_3.subjectB1.setText(practicalsModel.getSubjectB1());
			pvh_3.subjectB2.setText(practicalsModel.getSubjectB2());
			pvh_3.subjectB3.setText(practicalsModel.getSubjectB3());
			pvh_3.teacherB1.setText(practicalsModel.getTeacherB1());
			pvh_3.teacherB2.setText(practicalsModel.getTeacherB2());
			pvh_3.teacherB3.setText(practicalsModel.getTeacherB3());
			pvh_3.roomB1.setText(practicalsModel.getRoomB1());
			pvh_3.roomB2.setText(practicalsModel.getRoomB2());
			pvh_3.roomB3.setText(practicalsModel.getRoomB3());
		}
		else if (holder.getItemViewType() == PRACTICAL4)
		{
			Practical_4 practicalsModel = (Practical_4) mArrayList.get(position);
			PracticalViewHolder_4 pvh_4 = (PracticalViewHolder_4) holder;
			pvh_4.practicalTime.setText(practicalsModel.getTime());
			pvh_4.subjectB1.setText(practicalsModel.getSubjectB1());
			pvh_4.subjectB2.setText(practicalsModel.getSubjectB2());
			pvh_4.subjectB3.setText(practicalsModel.getSubjectB3());
			pvh_4.subjectB4.setVisibility(View.VISIBLE);
			pvh_4.subjectB4.setText(practicalsModel.getSubjectB4());
			pvh_4.teacherB1.setText(practicalsModel.getTeacherB1());
			pvh_4.teacherB2.setText(practicalsModel.getTeacherB2());
			pvh_4.teacherB3.setText(practicalsModel.getTeacherB3());
			pvh_4.teacherB4.setVisibility(View.VISIBLE);
			pvh_4.teacherB4.setText(practicalsModel.getTeacherB4());
			pvh_4.roomB1.setText(practicalsModel.getRoomB1());
			pvh_4.roomB2.setText(practicalsModel.getRoomB2());
			pvh_4.roomB3.setText(practicalsModel.getRoomB3());
			pvh_4.roomB4.setVisibility(View.VISIBLE);
			pvh_4.roomB4.setText(practicalsModel.getRoomB4());
		}
		
		else if (holder.getItemViewType() == PRACTICAL5)
		{
			Practical_5 practicalsModel = (Practical_5) mArrayList.get(position);
			PracticalViewHolder_5 pvh_5 = (PracticalViewHolder_5) holder;
			pvh_5.practicalTime.setText(practicalsModel.getTime());
			pvh_5.subjectB1.setText(practicalsModel.getSubjectB1());
			pvh_5.subjectB2.setText(practicalsModel.getSubjectB2());
			pvh_5.subjectB3.setText(practicalsModel.getSubjectB3());
			pvh_5.subjectB4.setVisibility(View.VISIBLE);
			pvh_5.subjectB4.setText(practicalsModel.getSubjectB4());
			pvh_5.subjectB5.setVisibility(View.VISIBLE);
			pvh_5.subjectB5.setText(practicalsModel.getSubjectB5());
			pvh_5.teacherB1.setText(practicalsModel.getTeacherB1());
			pvh_5.teacherB2.setText(practicalsModel.getTeacherB2());
			pvh_5.teacherB3.setText(practicalsModel.getTeacherB3());
			pvh_5.teacherB4.setVisibility(View.VISIBLE);
			pvh_5.teacherB4.setText(practicalsModel.getTeacherB4());
			pvh_5.teacherB5.setVisibility(View.VISIBLE);
			pvh_5.teacherB5.setText(practicalsModel.getTeacherB5());
			pvh_5.roomB1.setText(practicalsModel.getRoomB1());
			pvh_5.roomB2.setText(practicalsModel.getRoomB2());
			pvh_5.roomB3.setText(practicalsModel.getRoomB3());
			pvh_5.roomB4.setVisibility(View.VISIBLE);
			pvh_5.roomB4.setText(practicalsModel.getRoomB4());
			pvh_5.roomB5.setVisibility(View.VISIBLE);
			pvh_5.roomB5.setText(practicalsModel.getRoomB5());
		}
		
		else if (holder.getItemViewType() == PRACTICAL6)
		{
			Practical_6 practicalsModel = (Practical_6) mArrayList.get(position);
			PracticalViewHolder_6 pvh_6 = (PracticalViewHolder_6) holder;
			pvh_6.practicalTime.setText(practicalsModel.getTime());
			pvh_6.subjectB1.setText(practicalsModel.getSubjectB1());
			pvh_6.subjectB2.setText(practicalsModel.getSubjectB2());
			pvh_6.subjectB3.setText(practicalsModel.getSubjectB3());
			pvh_6.subjectB4.setVisibility(View.VISIBLE);
			pvh_6.subjectB4.setText(practicalsModel.getSubjectB4());
			pvh_6.subjectB5.setVisibility(View.VISIBLE);
			pvh_6.subjectB5.setText(practicalsModel.getSubjectB5());
			pvh_6.subjectB6.setVisibility(View.VISIBLE);
			pvh_6.subjectB6.setText(practicalsModel.getSubjectB6());
			pvh_6.teacherB1.setText(practicalsModel.getTeacherB1());
			pvh_6.teacherB2.setText(practicalsModel.getTeacherB2());
			pvh_6.teacherB3.setText(practicalsModel.getTeacherB3());
			pvh_6.teacherB4.setVisibility(View.VISIBLE);
			pvh_6.teacherB4.setText(practicalsModel.getTeacherB4());
			pvh_6.teacherB5.setVisibility(View.VISIBLE);
			pvh_6.teacherB5.setText(practicalsModel.getTeacherB5());
			pvh_6.teacherB6.setVisibility(View.VISIBLE);
			pvh_6.teacherB6.setText(practicalsModel.getTeacherB6());
			pvh_6.roomB1.setText(practicalsModel.getRoomB1());
			pvh_6.roomB2.setText(practicalsModel.getRoomB2());
			pvh_6.roomB3.setText(practicalsModel.getRoomB3());
			pvh_6.roomB4.setVisibility(View.VISIBLE);
			pvh_6.roomB4.setText(practicalsModel.getRoomB4());
			pvh_6.roomB5.setVisibility(View.VISIBLE);
			pvh_6.roomB5.setText(practicalsModel.getRoomB5());
			pvh_6.roomB6.setVisibility(View.VISIBLE);
			pvh_6.roomB6.setText(practicalsModel.getRoomB6());
		}
		
		else
		{
			LectureViewHolder lvh = (LectureViewHolder) holder;
			LecturesModel lecturesModel = (LecturesModel) mArrayList.get(position);
			lvh.lectureTime.setText(lecturesModel.getTime());
			lvh.lectureRoom.setText(lecturesModel.getRoom());
			lvh.lectureSubject.setText(lecturesModel.getSubject());
			lvh.lectureTeacher.setText(lecturesModel.getTeacher());
		}
	}
	
	@Override
	public int getItemCount()
	{
		if (mArrayList.size() == 0) { return 0; }
		else { return mArrayList.size(); }
	}
	
	@Override
	public int getItemViewType(int position)
	{
		if (mArrayList.get(position) instanceof Practical_3)
		{
			return PRACTICAL3;
		}
		else if (mArrayList.get(position) instanceof Practical_4)
		{
			return PRACTICAL4;
		}
		else if (mArrayList.get(position) instanceof Practical_5)
		{
			return PRACTICAL5;
		}
		else if (mArrayList.get(position) instanceof Practical_6)
		{
			return PRACTICAL6;
		}
		else
		{ return LECTURE; }
	}
	
	public class LectureViewHolder extends RecyclerView.ViewHolder
	{
		
		TextView lectureTime, lectureSubject, lectureTeacher, lectureRoom;
		
		public LectureViewHolder(View itemView)
		{
			super(itemView);
			
			//Lecture
			
			lectureTime = (TextView) itemView.findViewById(R.id.lecture_time);
			
			lectureSubject = (TextView) itemView.findViewById(R.id.lectureSubject);
			lectureTeacher = (TextView) itemView.findViewById(R.id.lectureTeacher);
			lectureRoom = (TextView) itemView.findViewById(R.id.lectureRoom);
		}
	}
	
	
	
	public class PracticalViewHolder_3 extends RecyclerView.ViewHolder
	{
		TextView practicalTime, subjectB1, subjectB2, subjectB3, teacherB1, teacherB2, teacherB3, roomB1, roomB2, roomB3;
		View separator3;
		
		public PracticalViewHolder_3(View itemView)
		{
			super(itemView);
			
			//Practical
			
			practicalTime = (TextView) itemView.findViewById(R.id.practicalTime_3);
			
			subjectB1 = (TextView) itemView.findViewById(R.id.subjectB1_3);
			subjectB2 = (TextView) itemView.findViewById(R.id.subjectB2_3);
			subjectB3 = (TextView) itemView.findViewById(R.id.subjectB3_3);
			
			teacherB1 = (TextView) itemView.findViewById(R.id.teacherB1_3);
			teacherB2 = (TextView) itemView.findViewById(R.id.teacherB2_3);
			teacherB3 = (TextView) itemView.findViewById(R.id.teacherB3_3);
			
			roomB1 = (TextView) itemView.findViewById(R.id.roomB1_3);
			roomB2 = (TextView) itemView.findViewById(R.id.roomB2_3);
			roomB3 = (TextView) itemView.findViewById(R.id.roomB3_3);
			
			separator3 = (View) itemView.findViewById(R.id.separator3_3);
		}
		
	}
	
	
	public class PracticalViewHolder_4 extends RecyclerView.ViewHolder
	{
		
		TextView practicalTime, subjectB1, subjectB2, subjectB3, teacherB1, teacherB2, teacherB3, roomB1, roomB2, roomB3;
		TextView subjectB4,teacherB4,roomB4;
		View separator3, separator4;
		
		
		public PracticalViewHolder_4(View itemView)
		{
			super(itemView);
			
			//Practical
			
			practicalTime = (TextView) itemView.findViewById(R.id.practicalTime_4);
			
			subjectB1 = (TextView) itemView.findViewById(R.id.subjectB1_4);
			subjectB2 = (TextView) itemView.findViewById(R.id.subjectB2_4);
			subjectB3 = (TextView) itemView.findViewById(R.id.subjectB3_4);
			subjectB4 = (TextView) itemView.findViewById(R.id.subjectB4_4);
			
			teacherB1 = (TextView) itemView.findViewById(R.id.teacherB1_4);
			teacherB2 = (TextView) itemView.findViewById(R.id.teacherB2_4);
			teacherB3 = (TextView) itemView.findViewById(R.id.teacherB3_4);
			teacherB4 = (TextView) itemView.findViewById(R.id.teacherB4_4);
			
			roomB1 = (TextView) itemView.findViewById(R.id.roomB1_4);
			roomB2 = (TextView) itemView.findViewById(R.id.roomB2_4);
			roomB3 = (TextView) itemView.findViewById(R.id.roomB3_4);
			roomB4 = (TextView) itemView.findViewById(R.id.roomB4_4);
			
			separator3 = (View) itemView.findViewById(R.id.separator3_4);
			separator4 = (View) itemView.findViewById(R.id.separator4_4);
		}
	}
	
	public class PracticalViewHolder_5 extends RecyclerView.ViewHolder
	{
		
		TextView practicalTime, subjectB1, subjectB2, subjectB3, teacherB1, teacherB2, teacherB3, roomB1, roomB2, roomB3;
		TextView subjectB4,subjectB5,teacherB4,teacherB5,roomB4,roomB5;
		View separator3, separator4,separator5;
		
		
		public PracticalViewHolder_5(View itemView)
		{
			super(itemView);
			
			//Practical
			
			practicalTime = (TextView) itemView.findViewById(R.id.practicalTime_5);
			
			subjectB1 = (TextView) itemView.findViewById(R.id.subjectB1_5);
			subjectB2 = (TextView) itemView.findViewById(R.id.subjectB2_5);
			subjectB3 = (TextView) itemView.findViewById(R.id.subjectB3_5);
			subjectB4 = (TextView) itemView.findViewById(R.id.subjectB4_5);
			subjectB5 = (TextView) itemView.findViewById(R.id.subjectB5_5);
			
			teacherB1 = (TextView) itemView.findViewById(R.id.teacherB1_5);
			teacherB2 = (TextView) itemView.findViewById(R.id.teacherB2_5);
			teacherB3 = (TextView) itemView.findViewById(R.id.teacherB3_5);
			teacherB4 = (TextView) itemView.findViewById(R.id.teacherB4_5);
			teacherB5 = (TextView) itemView.findViewById(R.id.teacherB5_5);
			
			roomB1 = (TextView) itemView.findViewById(R.id.roomB1_5);
			roomB2 = (TextView) itemView.findViewById(R.id.roomB2_5);
			roomB3 = (TextView) itemView.findViewById(R.id.roomB3_5);
			roomB4 = (TextView) itemView.findViewById(R.id.roomB4_5);
			roomB5 = (TextView) itemView.findViewById(R.id.roomB5_5);
			
			separator3 = (View) itemView.findViewById(R.id.separator3_5);
			separator4 = (View) itemView.findViewById(R.id.separator4_5);
			separator5 = (View) itemView.findViewById(R.id.separator5_5);
		}
	}
	
	public class PracticalViewHolder_6 extends RecyclerView.ViewHolder
	{
		
		TextView practicalTime, subjectB1, subjectB2, subjectB3, teacherB1, teacherB2, teacherB3, roomB1, roomB2, roomB3;
		TextView subjectB4, subjectB5, subjectB6, teacherB4, teacherB5, teacherB6, roomB4, roomB5, roomB6;
		View separator3, separator4, separator5, separator6;
		
		
		public PracticalViewHolder_6(View itemView)
		{
			super(itemView);
			
			//Practical
			
			practicalTime = (TextView) itemView.findViewById(R.id.practicalTime_6);
			
			subjectB1 = (TextView) itemView.findViewById(R.id.subjectB1_6);
			subjectB2 = (TextView) itemView.findViewById(R.id.subjectB2_6);
			subjectB3 = (TextView) itemView.findViewById(R.id.subjectB3_6);
			subjectB4 = (TextView) itemView.findViewById(R.id.subjectB4_6);
			subjectB5 = (TextView) itemView.findViewById(R.id.subjectB5_6);
			subjectB6 = (TextView) itemView.findViewById(R.id.subjectB6_6);
			
			teacherB1 = (TextView) itemView.findViewById(R.id.teacherB1_6);
			teacherB2 = (TextView) itemView.findViewById(R.id.teacherB2_6);
			teacherB3 = (TextView) itemView.findViewById(R.id.teacherB3_6);
			teacherB4 = (TextView) itemView.findViewById(R.id.teacherB4_6);
			teacherB5 = (TextView) itemView.findViewById(R.id.teacherB5_6);
			teacherB6 = (TextView) itemView.findViewById(R.id.teacherB6_6);
			
			roomB1 = (TextView) itemView.findViewById(R.id.roomB1_6);
			roomB2 = (TextView) itemView.findViewById(R.id.roomB2_6);
			roomB3 = (TextView) itemView.findViewById(R.id.roomB3_6);
			roomB4 = (TextView) itemView.findViewById(R.id.roomB4_6);
			roomB5 = (TextView) itemView.findViewById(R.id.roomB5_6);
			roomB6 = (TextView) itemView.findViewById(R.id.roomB6_6);
			
			separator3 = (View) itemView.findViewById(R.id.separator3_6);
			separator4 = (View) itemView.findViewById(R.id.separator4_6);
			separator5 = (View) itemView.findViewById(R.id.separator5_6);
			separator6 = (View) itemView.findViewById(R.id.separator6_6);
			
		}
	}
	
}
