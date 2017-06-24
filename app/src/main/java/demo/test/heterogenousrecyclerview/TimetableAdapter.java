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

public class TimetableAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int LECTURE = 1;
    private final int PRACTICAL = 2;
    private ArrayList<Object> mArrayList;
    private Context mContext;


    public TimetableAdapter(ArrayList<Object> arrayList, Context context) {
        mArrayList = arrayList;
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView;

        if (viewType == PRACTICAL) {
            itemView = LayoutInflater.from(mContext).inflate(R.layout.practical_list_item, parent, false);
            return new PracticalViewHolder(itemView);
        } else {
            itemView = LayoutInflater.from(mContext).inflate(R.layout.lecture_list_item, parent, false);
            return new LectureViewHolder(itemView);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == PRACTICAL) {

            PracticalsModel practicalsModel = (PracticalsModel) mArrayList.get(position);
            PracticalViewHolder pvh = (PracticalViewHolder) holder;
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
        } else {
            LectureViewHolder lvh = (LectureViewHolder) holder;
            LecturesModel lecturesModel = (LecturesModel) mArrayList.get(position);
            lvh.lectureTime.setText(lecturesModel.getTime());
            lvh.lectureRoom.setText(lecturesModel.getRoom());
            lvh.lectureSubject.setText(lecturesModel.getSubject());
            lvh.lectureTeacher.setText(lecturesModel.getTeacher());
        }
    }

    @Override
    public int getItemCount() {
        if (mArrayList.size() == 0) return 0;
        else return mArrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mArrayList.get(position) instanceof PracticalsModel) {
            return PRACTICAL;
        } else
            return LECTURE;
    }

    public class LectureViewHolder extends RecyclerView.ViewHolder {

        TextView lectureTime, lectureSubject, lectureTeacher, lectureRoom;

        public LectureViewHolder(View itemView) {
            super(itemView);

            //Lecture

            lectureTime = (TextView) itemView.findViewById(R.id.lecture_time);

            lectureSubject = (TextView) itemView.findViewById(R.id.lectureSubject);
            lectureTeacher = (TextView) itemView.findViewById(R.id.lectureTeacher);
            lectureRoom = (TextView) itemView.findViewById(R.id.lectureRoom);
        }
    }

    public class PracticalViewHolder extends RecyclerView.ViewHolder {

        TextView practicalTime, subjectB1, subjectB2, subjectB3, teacherB1, teacherB2, teacherB3, roomB1, roomB2, roomB3;

        public PracticalViewHolder(View itemView) {
            super(itemView);

            //Practical

            practicalTime = (TextView) itemView.findViewById(R.id.practicalTime);

            subjectB1 = (TextView) itemView.findViewById(R.id.subjectB1);
            subjectB2 = (TextView) itemView.findViewById(R.id.subjectB2);
            subjectB3 = (TextView) itemView.findViewById(R.id.subjectB3);

            teacherB1 = (TextView) itemView.findViewById(R.id.teacherB1);
            teacherB2 = (TextView) itemView.findViewById(R.id.teacherB2);
            teacherB3 = (TextView) itemView.findViewById(R.id.teacherB3);

            roomB1 = (TextView) itemView.findViewById(R.id.roomB1);
            roomB2 = (TextView) itemView.findViewById(R.id.roomB2);
            roomB3 = (TextView) itemView.findViewById(R.id.roomB3);
        }
    }

}
