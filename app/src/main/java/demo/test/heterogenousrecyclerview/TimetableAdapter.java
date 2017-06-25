package demo.test.heterogenousrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by adicool on 24/6/17.
 */

public class TimetableAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
	
	private final int LECTURE = 1;
	private final int PRACTICAL = 2;
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
		
		if (viewType == PRACTICAL)
		{
			itemView = LayoutInflater.from(mContext).inflate(R.layout.practical_list_item, parent, false);
			return new PracticalViewHolder(itemView);
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
		if (holder.getItemViewType() == PRACTICAL)
		{
			PracticalsModel practicalsModel = (PracticalsModel) mArrayList.get(position);
			PracticalViewHolder pvh = (PracticalViewHolder) holder;
			if (PracticalsModel.COUNT == 3)
			{
				pvh.practicalTime.setText(practicalsModel.getTime());
				pvh.subjectB1.setText(practicalsModel.getSubjectB1());
				pvh.subjectB2.setText(practicalsModel.getSubjectB2());
				pvh.subjectB3.setText(practicalsModel.getSubjectB3());
				pvh.teacherB1.setText(practicalsModel.getTeacherB1());
				pvh.teacherB2.setText(practicalsModel.getTeacherB2());
				pvh.teacherB3.setText(practicalsModel.getTeacherB3());
				pvh.roomB1.setText(practicalsModel.getRoomB1());
				pvh.roomB2.setText(practicalsModel.getRoomB2());
				pvh.roomB3.setText(practicalsModel.getRoomB3());
				pvh.separator3.setLayoutParams(new RelativeLayout.LayoutParams(1, RelativeLayout.LayoutParams.MATCH_PARENT));
			}
			
			else if (PracticalsModel.COUNT == 4)
			{
				pvh.practicalTime.setText(practicalsModel.getTime());
				pvh.subjectB1.setText(practicalsModel.getSubjectB1());
				pvh.subjectB2.setText(practicalsModel.getSubjectB2());
				pvh.subjectB3.setText(practicalsModel.getSubjectB3());
				pvh.subjectB4.setVisibility(View.VISIBLE);
				pvh.subjectB4.setText(practicalsModel.getSubjectB4());
				pvh.teacherB1.setText(practicalsModel.getTeacherB1());
				pvh.teacherB2.setText(practicalsModel.getTeacherB2());
				pvh.teacherB3.setText(practicalsModel.getTeacherB3());
				pvh.teacherB4.setVisibility(View.VISIBLE);
				pvh.teacherB4.setText(practicalsModel.getTeacherB4());
				pvh.roomB1.setText(practicalsModel.getRoomB1());
				pvh.roomB2.setText(practicalsModel.getRoomB2());
				pvh.roomB3.setText(practicalsModel.getRoomB3());
				pvh.roomB4.setVisibility(View.VISIBLE);
				pvh.roomB4.setText(practicalsModel.getRoomB4());
				pvh.separator4.setVisibility(View.VISIBLE);
				pvh.separator4.setLayoutParams(new RelativeLayout.LayoutParams(1, RelativeLayout.LayoutParams.MATCH_PARENT));
			}
			
			else if (PracticalsModel.COUNT == 5)
			{
				pvh.practicalTime.setText(practicalsModel.getTime());
				pvh.subjectB1.setText(practicalsModel.getSubjectB1());
				pvh.subjectB2.setText(practicalsModel.getSubjectB2());
				pvh.subjectB3.setText(practicalsModel.getSubjectB3());
				pvh.subjectB4.setVisibility(View.VISIBLE);
				pvh.subjectB4.setText(practicalsModel.getSubjectB4());
				pvh.subjectB5.setVisibility(View.VISIBLE);
				pvh.subjectB5.setText(practicalsModel.getSubjectB5());
				pvh.teacherB1.setText(practicalsModel.getTeacherB1());
				pvh.teacherB2.setText(practicalsModel.getTeacherB2());
				pvh.teacherB3.setText(practicalsModel.getTeacherB3());
				pvh.teacherB4.setVisibility(View.VISIBLE);
				pvh.teacherB4.setText(practicalsModel.getTeacherB4());
				pvh.teacherB5.setVisibility(View.VISIBLE);
				pvh.teacherB5.setText(practicalsModel.getTeacherB5());
				pvh.roomB1.setText(practicalsModel.getRoomB1());
				pvh.roomB2.setText(practicalsModel.getRoomB2());
				pvh.roomB3.setText(practicalsModel.getRoomB3());
				pvh.roomB4.setVisibility(View.VISIBLE);
				pvh.roomB4.setText(practicalsModel.getRoomB4());
				pvh.roomB5.setVisibility(View.VISIBLE);
				pvh.roomB5.setText(practicalsModel.getRoomB5());
				pvh.separator4.setVisibility(View.VISIBLE);
				pvh.separator5.setVisibility(View.VISIBLE);
				pvh.separator5.setLayoutParams(new RelativeLayout.LayoutParams(1, RelativeLayout.LayoutParams.MATCH_PARENT));
			}
			
			else if (PracticalsModel.COUNT == 6)
			{
				pvh.practicalTime.setText(practicalsModel.getTime());
				pvh.subjectB1.setText(practicalsModel.getSubjectB1());
				pvh.subjectB2.setText(practicalsModel.getSubjectB2());
				pvh.subjectB3.setText(practicalsModel.getSubjectB3());
				pvh.subjectB4.setVisibility(View.VISIBLE);
				pvh.subjectB4.setText(practicalsModel.getSubjectB4());
				pvh.subjectB5.setVisibility(View.VISIBLE);
				pvh.subjectB5.setText(practicalsModel.getSubjectB5());
				pvh.subjectB6.setVisibility(View.VISIBLE);
				pvh.subjectB6.setText(practicalsModel.getSubjectB6());
				pvh.teacherB1.setText(practicalsModel.getTeacherB1());
				pvh.teacherB2.setText(practicalsModel.getTeacherB2());
				pvh.teacherB3.setText(practicalsModel.getTeacherB3());
				pvh.teacherB4.setVisibility(View.VISIBLE);
				pvh.teacherB4.setText(practicalsModel.getTeacherB4());
				pvh.teacherB5.setVisibility(View.VISIBLE);
				pvh.teacherB5.setText(practicalsModel.getTeacherB5());
				pvh.teacherB6.setVisibility(View.VISIBLE);
				pvh.teacherB6.setText(practicalsModel.getTeacherB6());
				pvh.roomB1.setText(practicalsModel.getRoomB1());
				pvh.roomB2.setText(practicalsModel.getRoomB2());
				pvh.roomB3.setText(practicalsModel.getRoomB3());
				pvh.roomB4.setVisibility(View.VISIBLE);
				pvh.roomB4.setText(practicalsModel.getRoomB4());
				pvh.roomB5.setVisibility(View.VISIBLE);
				pvh.roomB5.setText(practicalsModel.getRoomB5());
				pvh.roomB6.setVisibility(View.VISIBLE);
				pvh.roomB6.setText(practicalsModel.getRoomB6());
				pvh.separator4.setVisibility(View.VISIBLE);
				pvh.separator5.setVisibility(View.VISIBLE);
				pvh.separator6.setVisibility(View.VISIBLE);
				pvh.separator6.setLayoutParams(new RelativeLayout.LayoutParams(1, RelativeLayout.LayoutParams.MATCH_PARENT));
			}
			
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
		if (mArrayList.get(position) instanceof PracticalsModel)
		{
			return PRACTICAL;
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
	
	public class PracticalViewHolder extends RecyclerView.ViewHolder
	{
		
		TextView practicalTime, subjectB1, subjectB2, subjectB3, teacherB1, teacherB2, teacherB3, roomB1, roomB2, roomB3;
		TextView subjectB4, subjectB5, subjectB6, teacherB4, teacherB5, teacherB6, roomB4, roomB5, roomB6;
		View separator3,separator4,separator5,separator6;
		
		
		public PracticalViewHolder(View itemView)
		{
			super(itemView);
			
			//Practical
			
			practicalTime = (TextView) itemView.findViewById(R.id.practicalTime);
			
			subjectB1 = (TextView) itemView.findViewById(R.id.subjectB1);
			subjectB2 = (TextView) itemView.findViewById(R.id.subjectB2);
			subjectB3 = (TextView) itemView.findViewById(R.id.subjectB3);
			subjectB4 = (TextView) itemView.findViewById(R.id.subjectB4);
			subjectB5 = (TextView) itemView.findViewById(R.id.subjectB5);
			subjectB6 = (TextView) itemView.findViewById(R.id.subjectB6);
			
			teacherB1 = (TextView) itemView.findViewById(R.id.teacherB1);
			teacherB2 = (TextView) itemView.findViewById(R.id.teacherB2);
			teacherB3 = (TextView) itemView.findViewById(R.id.teacherB3);
			teacherB4 = (TextView) itemView.findViewById(R.id.teacherB4);
			teacherB5 = (TextView) itemView.findViewById(R.id.teacherB5);
			teacherB6 = (TextView) itemView.findViewById(R.id.teacherB6);
			
			roomB1 = (TextView) itemView.findViewById(R.id.roomB1);
			roomB2 = (TextView) itemView.findViewById(R.id.roomB2);
			roomB3 = (TextView) itemView.findViewById(R.id.roomB3);
			roomB4 = (TextView) itemView.findViewById(R.id.roomB4);
			roomB5 = (TextView) itemView.findViewById(R.id.roomB5);
			roomB6 = (TextView) itemView.findViewById(R.id.roomB6);
			
			separator3 = (View) itemView.findViewById(R.id.separator3);
			separator4 = (View) itemView.findViewById(R.id.separator4);
			separator5 = (View) itemView.findViewById(R.id.separator5);
			separator6 = (View) itemView.findViewById(R.id.separator6);
			
		}
	}
	
}
