package dev.ihm;

import dev.exception.PlatException;
import dev.ihm.options.IOptionMenu;

import dev.service.IPlatService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


import org.springframework.stereotype.Controller;

@Controller
public class Menu {

    private Map<Integer, IOptionMenu> actions = new HashMap<>();

    private String menu;
    private Scanner scanner;

    
    public Menu(Scanner scanner,IPlatService service,List<IOptionMenu> option) {
    	
    	int i = 1;
    	
    	for(IOptionMenu menu : option){
    		
    		
    		if(menu.isTerminate()){
    			 actions.put(99, menu);
    			
    		}else{	
    			 actions.put(i, menu);
    			i++;
    		}		
    		
    	}
    	
        this.scanner = scanner;
    }

    public void afficher() {

        boolean continuer = true;

        while (continuer) {

            System.out.println(getMenuTexte());

            int choix = this.scanner.nextInt();

            try {
                this.actions.get(choix).executer();
            } catch (PlatException e) {
                continuer = false;
                System.out.println(e.getMessage());
            }
        }
    }

    private String getMenuTexte() {
        if (menu == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("** Restaurant Console App **");
            sb.append("\n");
            this.actions.forEach((index, option) -> {
                sb.append(index + ". " + option.getTitre());
                sb.append("\n");
            });
            this.menu = sb.toString();
        }
        return this.menu;
    }
}
