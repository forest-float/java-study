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
		requestWindowFeature(Window.FEATURE_NO_TITLE);//表示标题不显示
		setContentView(R.layout.first_layout);//加载布局
		Button button1 = (Button) findViewById(R.id.button_1);
//		通过 findViewById()方法获取到在布局文件中定义的元素
//		findViewById()方法返回的是一个 View 对象，我们需要向下转型将它转成 Button对象
//		得到了按钮的实例之后，我们通过调用 setOnClickListener()方法为按钮注册一个监听
//		器，点击按钮时就会执行监听器中的 onClick()方法
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				Toast 的用法非常简单，通过静态方法 makeText()创建出一个 Toast 对象，
//				然后调用 show()将 Toast 显示出来就可以了
				Toast.makeText(FirstActivity.this, "you click button1", 
						Toast.LENGTH_SHORT).show();        
				
//				makeText()方法需要传入三个参数。第一
//				个参数是 Context，也就是 Toast 要求的上下文，由于活动本身就是一个 Context 对象，因此
//				这里直接传入 FirstActivity.this 即可。第二个参数是 Toast 显示的文本内容，第三个参数是 Toast
//				显示的时长，有两个内置常量可以选择 Toast.LENGTH_SHORT 和 Toast.LENGTH_LONG。
								
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
