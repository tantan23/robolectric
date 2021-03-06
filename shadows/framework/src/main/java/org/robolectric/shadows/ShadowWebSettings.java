package org.robolectric.shadows;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR2;

import android.content.Context;
import android.webkit.WebSettings;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

/**
 * Shadow of {@link WebSettings} which returns a dummy user a stub instance rather than the
 * User-Agent used by a WebView.
 */
@Implements(value = WebSettings.class)
public class ShadowWebSettings {

  /**
   * Returns the default User-Agent used by a WebView. An instance of WebView could use a different
   * User-Agent if a call is made to {@link WebSettings#setUserAgentString(String)}.
   *
   * @param context a Context object used to access application assets
   */
  @Implementation(minSdk = JELLY_BEAN_MR2)
  protected static String getDefaultUserAgent(Context context) {
    return "user";
  }
}
