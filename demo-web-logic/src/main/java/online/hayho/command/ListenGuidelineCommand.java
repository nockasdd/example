package online.hayho.command;

import online.hayho.core.dto.utils.ListenGuidelineDTO;
import online.hayho.core.web.command.AbstractCommand;

public class ListenGuidelineCommand extends AbstractCommand<ListenGuidelineDTO> {
    public ListenGuidelineCommand(){
        this.pojo = new ListenGuidelineDTO();
    }
}
