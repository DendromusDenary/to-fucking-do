package app;

import java.io.IOException;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import fw.hive.app.Application;
import lombok.extern.slf4j.Slf4j;


/**
 * @author Dendromus Denary
 */
@Slf4j
final public class ToFuckingDoApp extends Application<ToFuckingDoApp> {

	public static void main(String[] args) throws Exception {
		ToFuckingDoApp application = new ToFuckingDoApp();
		try {
			application.parse(new Options(), args).launch();
		} catch (Exception e) {
			log.error("Failed to launch application.", e);
			application.terminate(1);
		}
	}

	@Override
	public ToFuckingDoApp parse(final Options options, final String[] args) throws ParseException {
		return super.parse(options, args);
	}

	@Override
	public ToFuckingDoApp launch() throws Exception {
		return null;
	}

	@Override
	public void close() throws IOException {

	}
}
