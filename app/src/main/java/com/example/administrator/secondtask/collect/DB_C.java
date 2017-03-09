package com.example.administrator.secondtask.collect;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.administrator.secondtask.bean.Urls;

import java.util.ArrayList;


/**
 * Created by ASUS on 2017/1/9. collect
 */

public class DB_C {

    private SQLiteDatabase db;
    private Context context;
    private ArrayList<Urls> list;

    public DB_C(Context context) {
        db = new DB_M(context).getWritableDatabase();
        this.context = context;
    }


    public void add(String title, String url,String img) {
        String sql = "insert into " + DB_M.table_name + " values (null,'" + title
                + "','" + url + "','" + img + "')";
        db.execSQL(sql);
    }

    public void delete(String url) {
        //User u:list

                String sql = "delete from " + DB_M.table_name + " where url='" + url + "'";
                Log.e("msg", "删除" + sql);

                db.execSQL(sql);
                //Toast.makeText(context, "删除成功", Toast.LENGTH_SHORT).show();


    }

//    public void checkAll(ArrayList<User> list) {
//        for (int i = 0; i < list.size(); i++) {
//            if (!list.get(i).isCheck()) {
//                Log.e("sss",""+i);
//                for (User u : list) {
//                    u.setCheak(true);
//
//                }
//                return;
//            } else if (i == list.size()-1) {
//                for (User u : list) {
//                    u.setCheak(false);
//                    Log.e("zheli1","111111");
//
//                }
//            }
//            Log.e("sss",""+i);
//        }
//
//    }

//    /**
//     * 根据名字改数据
//     * @param name
//     */
//    public void alTer(String oldname,
//                        Editable name, Editable type, Editable position,int address){
//
//        db.execSQL("UPDATE info SET name='"+name+"',type='"+type+"',position='"+position+"',picture="+address+" WHERE name='"+oldname+"';");
//
//    }



    public ArrayList<Urls> showAll(){
         list=new ArrayList<Urls>();

        String sql="select * from " +DB_M.table_name ;
        Cursor cursor= db.rawQuery(sql,null);
        while(cursor.moveToNext()){
//             User user =new User();

//            new Urls(cursor.getString(cursor.getColumnIndex("name")),
//            cursor.getString(cursor.getColumnIndex("url")))


//             String name=cursor.getString(cursor.getColumnIndex("name"));
//            user.setName(name);
//            user.setName(cursor.getString(cursor.getColumnIndex("name")));
//            user.setPassword(cursor.getString(cursor.getColumnIndex("password")));
//            User user =new User(cursor.getString(cursor.getColumnIndex("name")),
//                    cursor.getString(cursor.getColumnIndex("password")));
            list.add(new Urls(cursor.getString(cursor.getColumnIndex("title")),
                    cursor.getString(cursor.getColumnIndex("url")),
                    cursor.getString(cursor.getColumnIndex("img"))));
        }
        cursor.close();
        Log.e("msg111",list+" ");
        return list;
    }


//    public ArrayList<Integer> getTulist(ArrayList<Integer> list){
//        //ArrayList<Integer> list = new ArrayList<>();
//        list.add(R.drawable.kapai);
//        list.add(R.drawable.kate);
//        list.add(R.drawable.fatiao);
//        list.add(R.drawable.nvjing);
//        list.add(R.drawable.zhunv);
//        list.add(R.drawable.anni);
//        list.add(R.drawable.chuanzhang);
//        list.add(R.drawable.houzi);
//        list.add(R.drawable.kapai);
//        list.add(R.drawable.kate);
//        list.add(R.drawable.fatiao);
//        list.add(R.drawable.nvjing);
//        list.add(R.drawable.zhunv);
//        list.add(R.drawable.anni);
//        list.add(R.drawable.chuanzhang);
//        list.add(R.drawable.houzi);
//
//        return list;
//    }


//方便刷新收藏功能清空后重新传值
public ArrayList<Urls>  getlist(){
        return list;
    }
}
