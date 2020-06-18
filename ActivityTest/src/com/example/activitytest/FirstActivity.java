package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//��ʾ���ⲻ��ʾ
		setContentView(R.layout.first_layout);//���ز���
		Button button1 = (Button) findViewById(R.id.button_1);
//		ͨ�� findViewById()������ȡ���ڲ����ļ��ж����Ԫ��
//		findViewById()�������ص���һ�� View ����������Ҫ����ת�ͽ���ת�� Button����
//		�õ��˰�ť��ʵ��֮������ͨ������ setOnClickListener()����Ϊ��ťע��һ������
//		���������ťʱ�ͻ�ִ�м������е� onClick()����
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				Toast ���÷��ǳ��򵥣�ͨ����̬���� makeText()������һ�� Toast ����
//				Ȼ����� show()�� Toast ��ʾ�����Ϳ�����
				Toast.makeText(FirstActivity.this, "you click button1", 
						Toast.LENGTH_SHORT).show();        
				
//				makeText()������Ҫ����������������һ
//				�������� Context��Ҳ���� Toast Ҫ��������ģ����ڻ�������һ�� Context �������
//				����ֱ�Ӵ��� FirstActivity.this ���ɡ��ڶ��������� Toast ��ʾ���ı����ݣ������������� Toast
//				��ʾ��ʱ�������������ó�������ѡ�� Toast.LENGTH_SHORT �� Toast.LENGTH_LONG��
								
			}
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.add_item:
				Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
				break;
			case R.id.remove_item:
				Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
				break;
			default:
		}
		return true;

	}

}
