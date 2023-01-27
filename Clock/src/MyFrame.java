import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;

    String time;
    String day;
    String date;



    MyFrame(){
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(400,300);
        //this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        timeFormat=new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");



        timeLabel=new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0X00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,30));
        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,20));


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);

        this.setVisible(true);

        setTime();
    }


    public void setTime(){
        while (true){

            time=timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

            day=dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date=dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);




            try {
            Thread.sleep(1000);

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        }


        }

    }
