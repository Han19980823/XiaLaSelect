package com.example.myspinner;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends Activity {

    private Spinner spinner;
    public void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_spinner);

        initView();
    }

    private void initView() {
        spinner = (Spinner) findViewById(R.id.spinner);

//        //获取资源文件，通过array资源获取name为province的数组
//        String[] stringArray = getResources().getStringArray(R.array.province);
//        spinner = (Spinner) findViewById(R.id.spinner2);
//        //新建一个数组适配器ArrayAdapter设置三个参数：上下文，下拉列表的样式，数据源
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, stringArray);
//        //将适配器设置给Spinner
//        spinner.setAdapter(adapter);

        //设置item的被选择的监听
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //当item被选择后调用此方法
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //获取我们所选中的内容
                String s = parent.getItemAtPosition(position).toString();
                //弹一个吐司提示我们所选中的内容
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }
            //只有当patent中的资源没有时，调用此方法
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}