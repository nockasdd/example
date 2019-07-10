package online.hayho.command;


import online.hayho.core.dto.utils.UserDTO;
import online.hayho.core.web.command.AbstractCommand;

public class UserCommand extends AbstractCommand<UserDTO> {
    public UserCommand(){
        this.pojo = new UserDTO();
    }
}
