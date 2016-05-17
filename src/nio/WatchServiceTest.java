package nio;

import java.io.IOException;
import java.nio.file.*;

public class WatchServiceTest {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\FolderWatched");
		WatchService watchService = null;
		try {
			watchService = path.getFileSystem().newWatchService();
			path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		// infinite loop
		while (true) {
			WatchKey key = null;
			try {
				key = watchService.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// iterate for each event
			for (WatchEvent<?> event : key.pollEvents()) {
				switch (event.kind().name()) {
				case "OVERFLOW":
					System.out.println("We lost some events");
					break;
				case "ENTRY_MODIFY":
					System.out.println("File " + event.context()+ " is changed!");
					break;
				default: 
					System.out.println("Nothing happend in " + event.context());
				}
			}
			// resetting the key is important to receive subsequent
			// notifications
			key.reset();
		}
	}
}