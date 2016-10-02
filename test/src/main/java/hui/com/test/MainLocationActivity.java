package hui.com.test;

import android.util.Log;

import com.anthui.LocationActivity;
import com.anthui.PingYinUtil;

public class MainLocationActivity extends LocationActivity {
    @Override
    //选择完城市后会自动调用这个方法，
    public void startActivity(String city) {
        //根据城市获取首字母大写
        String firYin = PingYinUtil.converterToFirstSpell(city)
                .substring(0, 1).toUpperCase();
        Log.e("msgs", "startActivity:------------- " +city+ firYin);
    }
}
