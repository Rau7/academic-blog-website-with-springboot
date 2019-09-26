package com.blog.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.blog.models.DashboardInformation;
import com.blog.services.DashboardInformationService;

import com.blog.models.ArticleInformation;
import com.blog.services.ArticlesInformationService;

import com.blog.models.AboutInformation;
import com.blog.services.AboutInformationService;

import com.blog.models.PostInformation;
import com.blog.services.PostsInformationService;

import com.blog.models.BookInformation;
import com.blog.services.BooksInformationService;

import com.blog.models.WpaperInformation;
import com.blog.services.WpapersInformationService;

import com.blog.models.GalleryInformation;
import com.blog.services.GalleryInformationService;


@Controller
public class AdminController {
	
	@Autowired
	private AboutInformationService aboutService;
	
	@Autowired
	private ArticlesInformationService articleService;
	
	@Autowired
	private DashboardInformationService dashService;
	
	@Autowired
	private PostsInformationService postService;
	
	@Autowired
	private BooksInformationService bookService;
	
	@Autowired
	private WpapersInformationService wpaperService;
	
	@Autowired
	private GalleryInformationService galleryService;
	
	public static String uploadDirectory = System.getProperty("user.dir")+"/src/main/resources/static/uploads";
	
	
	
	@RequestMapping(value = "/admin/index", method = RequestMethod.GET)
	public String index(Model model) {
		AboutInformation aboutInformation = aboutService.getAbout(1);
		ArticleInformation articleInformation = articleService.getArticle(1);
		model.addAttribute("aboutInformation", aboutInformation);
		model.addAttribute("articleInformation", articleInformation);
		return "admin_index";
	}
	
	@RequestMapping(value="/admin/dashboard_settings", method=RequestMethod.GET)
	public String editDashboard(Model model) {
		DashboardInformation dashboard = dashService.getDashboard(1);
		model.addAttribute("dash", dashboard);
		return  "dashboard_sett";
	}
		
	@RequestMapping(value = "/admin/dashboard_sett", method = RequestMethod.POST)
	public String editDashboardPost(DashboardInformation dcoming , @RequestParam("slider") MultipartFile[] file1, @RequestParam("dashboard2") MultipartFile[] file2 , @RequestParam("dashboard3") MultipartFile[] file3) {
	 	DashboardInformation dash = dashService.getDashboard(1);
	 	
	 	String [] filenames = new String[3];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
	 	
	 	for (MultipartFile file : file3) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[2]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
	 	
       	 dash.setDashboard_writing_1(dcoming.getDashboard_writing_1());
       	 dash.setDashboard_writing_2(dcoming.getDashboard_writing_2());
       	 dash.setDashboard_photo(filenames[0]);
       	 dash.setDashboard_photo_2(filenames[1]);
       	 dash.setDashboard_mid_photo(filenames[2]);
        
        
	 	
		dashService.updateDashboard(dash);
		return "redirect:/admin/dashboard_settings";
	}
	
	@RequestMapping(value="/admin/about_settings", method=RequestMethod.GET)
	public String editAbout(Model model) {
		AboutInformation about = aboutService.getAbout(1);
		model.addAttribute("about", about);
		return  "about_sett";
	}
	
	@RequestMapping(value = "/admin/about_sett", method = RequestMethod.POST)
	public String editAboutPost(AboutInformation acoming, @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2, @RequestParam("photo1") MultipartFile[] file3, @RequestParam("photo2") MultipartFile[] file4, @RequestParam("photo3") MultipartFile[] file5, @RequestParam("photo4") MultipartFile[] file6) {
	 	AboutInformation agoing = aboutService.getAbout(1);
	 	
	 	String [] filenames = new String[6];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
	 	
	 	for (MultipartFile file : file3) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[2]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
	 	
	 	for (MultipartFile file : file4) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[3]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
	 	for (MultipartFile file : file5) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[4]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
	 	for (MultipartFile file : file6) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[5]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
		 	
		 	agoing.setAbout_title(acoming.getAbout_title());
		 	agoing.setAbout_desc(acoming.getAbout_desc());
		 	agoing.setAbout_mid_wr(acoming.getAbout_mid_wr());
		 	agoing.setAbout_short_wr(acoming.getAbout_short_wr());
		 	agoing.setSocial_email(acoming.getSocial_email());
		 	agoing.setSocial_email2(acoming.getSocial_email2());
		 	agoing.setSocial_facebook(acoming.getSocial_facebook());
		 	agoing.setSocial_instagram(acoming.getSocial_instagram());
		 	agoing.setSocial_twitter(acoming.getSocial_twitter());
		 	agoing.setSocial_skype(acoming.getSocial_skype());
		 	agoing.setSocial_linkedin(acoming.getSocial_linkedin());
		 	agoing.setSocial_reddit(acoming.getSocial_reddit());
		 	agoing.setSocial_youtube(acoming.getSocial_youtube());
		 	agoing.setAbout_dash_photo(filenames[0]);
		 	agoing.setAbout_file(filenames[1]);
		 	agoing.setAbout_page_p1(filenames[2]);
		 	agoing.setAbout_page_p2(filenames[3]);
		 	agoing.setAbout_page_p3(filenames[4]);
		 	agoing.setAbout_page_p4(filenames[5]);
		 	
		
	 	
	 	
		aboutService.updateAbout(agoing);
		return "redirect:/admin/about_settings";
	}
	
	@RequestMapping(value="/admin/post_list", method=RequestMethod.GET)
	public String listPost(Model model) {
		List<PostInformation> posts = postService.getPostInformationList(); 
		model.addAttribute("posts", posts);
		return  "post_list";
	}
	
	@RequestMapping(value="/admin/editpost/{post_id}", method=RequestMethod.GET)
	public String editPostG(Model model,@PathVariable("post_id") Integer id) {
		PostInformation post = postService.getPost(id);
		model.addAttribute("post", post);
		return  "post_detail";
	}
	
	/*
	 * @RequestMapping(value="editpost", method=RequestMethod.GET) public String
	 * editPostG(Model model,@RequestParam("post_id") Integer id) { PostInformation
	 * post = postService.getPost(id); model.addAttribute("post", post); return
	 * "post_detail"; }
	 */
	
	@RequestMapping(value = "/admin/editingpost/{post_id}", method = RequestMethod.POST)
	public String editPostP(@PathVariable("post_id") Integer id, PostInformation postcome , @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2) {
	 	PostInformation postgo = postService.getPost(id);
	 	
	 	String [] filenames = new String[2];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
		 	
		 	postgo.setPost_title(postcome.getPost_title());
		 	postgo.setPost_body(postcome.getPost_body());
		 	postgo.setPost_short_wr(postcome.getPost_short_wr());
		 	postgo.setPost_file(filenames[0]);
		 	postgo.setPost_photo(filenames[1]);
		 	
		 	Date date = Calendar.getInstance().getTime();  
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
	        String strDate = dateFormat.format(date);  
		 	
		 	postgo.setPost_date(strDate);
	 	
	 		postService.updatePost(postgo);
		
		return "redirect:/admin/post_list";
	}
	
	@RequestMapping(value = "/admin/post_delete/{post_id}", method = RequestMethod.GET)
	public String deletePost(@PathVariable("post_id") Integer id) {
		PostInformation post=postService.getPost(id);
		postService.deletePost(post);
		return "redirect:/admin/post_list";
	}
	
	@RequestMapping(value = "/admin/add_post", method = RequestMethod.GET)
	public String postAddG(Model model) {
		model.addAttribute("postInformation", new PostInformation());
		return "post_add";
	}
	
	
	@RequestMapping(value = "/admin/add_post", method = RequestMethod.POST)
	public String postAddP(HttpServletRequest request, @ModelAttribute("PostInformation") PostInformation newPost, BindingResult result , @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2) {
		PostInformation post = new PostInformation();
		
		String [] filenames = new String[2];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
			
			post.setPost_title(newPost.getPost_title());
		 	post.setPost_body(newPost.getPost_body());
		 	post.setPost_short_wr(newPost.getPost_short_wr());
		 	post.setPost_file(filenames[0]);
		 	post.setPost_photo(filenames[1]);
		 	
		 	Date date = Calendar.getInstance().getTime();  
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
	        String strDate = dateFormat.format(date);  
		 	
		 	post.setPost_date(strDate);
		
		
		postService.save(post);
		
		return "redirect:/admin/post_list";
	}
	
	@RequestMapping(value="/admin/book_list", method=RequestMethod.GET)
    public String listBook(Model model) {
        List<BookInformation> books = bookService.getBookInformationList(); 
        model.addAttribute("books", books);
        return  "book_list";
    }
    
    @RequestMapping(value="/admin/editbook/{book_id}", method=RequestMethod.GET)
    public String editBookG(Model model,@PathVariable("book_id") Integer id) {
        BookInformation book = bookService.getBook(id);
        model.addAttribute("book", book);
        return  "book_detail";
    }
    
    @RequestMapping(value = "/admin/editingbook/{book_id}", method = RequestMethod.POST)
    public String editBookP(@PathVariable("book_id") Integer id, BookInformation bookcome , @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2) {
        BookInformation bookgo = bookService.getBook(id);
        
        String [] filenames = new String[2];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
            
            bookgo.setBook_title(bookcome.getBook_title());
            bookgo.setBook_body(bookcome.getBook_body());
            bookgo.setBook_short_wr(bookcome.getBook_short_wr());
            bookgo.setBook_file(filenames[0]);
            bookgo.setBook_photo(filenames[1]);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);  
            
            bookgo.setBook_date(strDate);
        
        
        bookService.updateBook(bookgo);
        
        return "redirect:/admin/book_list";
    }
    
    @RequestMapping(value = "/admin/book_delete/{book_id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("book_id") Integer id) {
        BookInformation book=bookService.getBook(id);
        bookService.deleteBook(book);
        return "redirect:/admin/book_list";
    }
    
    @RequestMapping(value = "/admin/add_book", method = RequestMethod.GET)
    public String bookAddG(Model model) {
        model.addAttribute("bookInformation", new BookInformation());
        return "book_add";
    }
    
    
	/*
	 * @RequestMapping(value = "add_book", method = RequestMethod.POST) public
	 * String bookAddP(HttpServletRequest
	 * request, @ModelAttribute("BookInformation") BookInformation newBook,
	 * BindingResult result) { BookInformation book = new BookInformation();
	 * book.setBook_title(newBook.getBook_title());
	 * book.setBook_body(newBook.getBook_body());
	 * book.setBook_file(newBook.getBook_file());
	 * book.setBook_photo(newBook.getBook_photo());
	 * 
	 * Date date = Calendar.getInstance().getTime(); DateFormat dateFormat = new
	 * SimpleDateFormat("dd/MM/yyyy"); String strDate = dateFormat.format(date);
	 * 
	 * book.setBook_date(strDate);
	 * 
	 * bookService.save(book);
	 * 
	 * return "redirect:/book_list"; }
	 */
    
    
    @RequestMapping(value = "/admin/add_book", method = RequestMethod.POST)
    public String bookAddP(HttpServletRequest request, @ModelAttribute("BookInformation") BookInformation newBook, @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2) {
        BookInformation book = new BookInformation();
        
        String [] filenames = new String[2];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }

            book.setBook_title(newBook.getBook_title());
            book.setBook_body(newBook.getBook_body());
            book.setBook_short_wr(newBook.getBook_short_wr());
            book.setBook_file(filenames[0]);
            book.setBook_photo(filenames[1]);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);  
            
            book.setBook_date(strDate);
        
        
        bookService.save(book);
        
        return "redirect:/admin/book_list";
    }
    
    @RequestMapping(value="/admin/article_list", method=RequestMethod.GET)
    public String listArticle(Model model) {
        List<ArticleInformation> articles = articleService.getArticleInformationList(); 
        model.addAttribute("articles", articles);
        return  "article_list";
    }
    
    @RequestMapping(value="/admin/editarticle/{article_id}", method=RequestMethod.GET)
    public String editArticleG(Model model,@PathVariable("article_id") Integer id) {
        ArticleInformation article = articleService.getArticle(id);
        model.addAttribute("article", article);
        return  "article_detail";
    }
    
    @RequestMapping(value = "/admin/editingarticle/{article_id}", method = RequestMethod.POST)
    public String editArticleP(@PathVariable("article_id") Integer id, ArticleInformation articlecome , @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2) {
        ArticleInformation articlego = articleService.getArticle(id);
        
        String [] filenames = new String[2];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
            articlego.setArticle_title(articlecome.getArticle_title());
            articlego.setArticle_body(articlecome.getArticle_body());
            articlego.setArticle_short_wr(articlecome.getArticle_short_wr());
            articlego.setArticle_file(filenames[0]);
            articlego.setArticle_photo(filenames[1]);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);  
            
            articlego.setArticle_date(strDate);	
        
        
        articleService.updateArticle(articlego);
        
        return "redirect:/admin/article_list";
    }
    
    @RequestMapping(value = "/admin/article_delete/{article_id}", method = RequestMethod.GET)
    public String deleteArticle(@PathVariable("article_id") Integer id) {
        ArticleInformation article=articleService.getArticle(id);
        articleService.deleteArticle(article);
        return "redirect:/admin/article_list";
    }
    
    @RequestMapping(value = "/admin/add_article", method = RequestMethod.GET)
    public String articleAddG(Model model) {
        model.addAttribute("articleInformation", new ArticleInformation());
        return "article_add";
    }
    
    
    @RequestMapping(value = "/admin/add_article", method = RequestMethod.POST)
    public String articleAddP(HttpServletRequest request, @ModelAttribute("ArticleInformation") ArticleInformation newArticle, BindingResult result, @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2) {
    	
        ArticleInformation article = new ArticleInformation();
        
        String [] filenames = new String[2];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
            
            article.setArticle_title(newArticle.getArticle_title());
            article.setArticle_body(newArticle.getArticle_body());
            article.setArticle_short_wr(newArticle.getArticle_short_wr());
            article.setArticle_file(filenames[0]);
            article.setArticle_photo(filenames[1]);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);  
            
            article.setArticle_date(strDate);
        
        
        articleService.save(article);
        
        return "redirect:/admin/article_list";
    }
    
    @RequestMapping(value="/admin/wpaper_list", method=RequestMethod.GET)
    public String listWpaper(Model model) {
        List<WpaperInformation> wpapers = wpaperService.getWpaperInformationList(); 
        model.addAttribute("wpapers", wpapers);
        return  "wpaper_list";
    }
    
    @RequestMapping(value="/admin/editwpaper/{wpaper_id}", method=RequestMethod.GET)
    public String editWpaperG(Model model,@PathVariable("wpaper_id") Integer id) {
        WpaperInformation wpaper = wpaperService.getWpaper(id);
        model.addAttribute("wpaper", wpaper);
        return  "wpaper_detail";
    }
    
    @RequestMapping(value = "/admin/editingwpaper/{wpaper_id}", method = RequestMethod.POST)
    public String editWpaperP(@PathVariable("wpaper_id") Integer id, WpaperInformation wpapercome , @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2) {
        WpaperInformation wpapergo = wpaperService.getWpaper(id);
        
        String [] filenames = new String[2];

	 	for (MultipartFile file : file1) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[0]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
       	 
	 	
	 	for (MultipartFile file : file2) {
    		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
             filenames[1]=file.getOriginalFilename();
             try {
               Files.write(fileNameAndPath, file.getBytes());
           } catch (IOException e) {
               e.printStackTrace();
           }
          }
            
            wpapergo.setWpaper_title(wpapercome.getWpaper_title());
            wpapergo.setWpaper_body(wpapercome.getWpaper_body());
            wpapergo.setWpaper_short_wr(wpapercome.getWpaper_short_wr());
            wpapergo.setWpaper_file(filenames[0]);
            wpapergo.setWpaper_photo(filenames[1]);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);  
            
            wpapergo.setWpaper_date(strDate);	
        
        
        wpaperService.updateWpaper(wpapergo);
        
        return "redirect:/admin/wpaper_list";
    }
    
    @RequestMapping(value = "/admin/wpaper_delete/{wpaper_id}", method = RequestMethod.GET)
    public String deleteWpaper(@PathVariable("wpaper_id") Integer id) {
        WpaperInformation wpaper=wpaperService.getWpaper(id);
        wpaperService.deleteWpaper(wpaper);
        return "redirect:/admin/wpaper_list";
    }
    
    @RequestMapping(value = "/admin/add_wpaper", method = RequestMethod.GET)
    public String wpaperAddG(Model model) {
        model.addAttribute("wpaperInformation", new WpaperInformation());
        return "wpaper_add";
    }
    
    
    @RequestMapping(value = "/admin/add_wpaper", method = RequestMethod.POST)
    public String wpaperAddP(HttpServletRequest request, @ModelAttribute("WpaperInformation") WpaperInformation newWpaper, BindingResult result, @RequestParam("photo") MultipartFile[] file1, @RequestParam("file") MultipartFile[] file2) {
        WpaperInformation wpaper = new WpaperInformation();
        
        	String [] filenames = new String[2];

    	 	for (MultipartFile file : file1) {
        		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
                 filenames[0]=file.getOriginalFilename();
                 try {
                   Files.write(fileNameAndPath, file.getBytes());
               } catch (IOException e) {
                   e.printStackTrace();
               }
              }
           	 
    	 	
    	 	for (MultipartFile file : file2) {
        		Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
                 filenames[1]=file.getOriginalFilename();
                 try {
                   Files.write(fileNameAndPath, file.getBytes());
               } catch (IOException e) {
                   e.printStackTrace();
               }
              }
            
            wpaper.setWpaper_title(newWpaper.getWpaper_title());
            wpaper.setWpaper_body(newWpaper.getWpaper_body());
            wpaper.setWpaper_short_wr(newWpaper.getWpaper_short_wr());
            wpaper.setWpaper_file(filenames[0]);
            wpaper.setWpaper_photo(filenames[1]);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);  
            
            wpaper.setWpaper_date(strDate);
        

        wpaperService.save(wpaper);
        
        return "redirect:/admin/wpaper_list";
    }
    
    @RequestMapping(value="/admin/gallery_list", method=RequestMethod.GET)
    public String listGallery(Model model) {
        List<GalleryInformation> gallerys = galleryService.getGalleryInformationList(); 
        model.addAttribute("gallerys", gallerys);
        return  "gallery_list";
    }
    
    @RequestMapping(value="/admin/editgallerry/{gallery_id}", method=RequestMethod.GET)
    public String editGalleryG(Model model,@PathVariable("gallery_id") Integer id) {
        GalleryInformation gallery = galleryService.getGallery(id);
        model.addAttribute("gallery", gallery);
        return  "gallery_detail";
    }
    
    @RequestMapping(value = "/admin/editinggallery/{gallery_id}", method = RequestMethod.POST)
    public String editGalleryP(@PathVariable("gallery_id") Integer id, GalleryInformation gallerycome , @RequestParam("photo") MultipartFile[] file1) {
        GalleryInformation gallerygo = galleryService.getGallery(id);
        
        String [] filenames = new String[1];

        for (MultipartFile file : file1) {
          Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
               filenames[0]=file.getOriginalFilename();
              try {
                Files.write(fileNameAndPath, file.getBytes());
              } catch (IOException e) {
               e.printStackTrace();
            }
          }
         
            gallerygo.setGallery_title(gallerycome.getGallery_title());
            gallerygo.setGallery_desc(gallerycome.getGallery_desc());
            gallerygo.setGallery_photo(filenames[0]);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);  
            
            gallerygo.setGallery_date(strDate); 
        
        
        galleryService.updateGallery(gallerygo);
        
        return "redirect:/admin/gallery_list";
    }
    
    @RequestMapping(value = "/admin/gallery_delete/{gallery_id}", method = RequestMethod.GET)
    public String deleteGallery(@PathVariable("gallery_id") Integer id) {
        GalleryInformation gallery=galleryService.getGallery(id);
        galleryService.deleteGallery(gallery);
        return "redirect:/admin/gallery_list";
    }
    
    @RequestMapping(value = "/admin/add_gallery", method = RequestMethod.GET)
    public String galleryAddG(Model model) {
        model.addAttribute("galleryInformation", new GalleryInformation());
        return "gallery_add";
    }
    
    
    @RequestMapping(value = "/admin/add_gallery", method = RequestMethod.POST)
    public String galleryAddP(HttpServletRequest request, @ModelAttribute("GalleryInformation") GalleryInformation newGallery, BindingResult result, @RequestParam("photo") MultipartFile[] file1) {
        GalleryInformation gallery = new GalleryInformation();
        
          String [] filenames = new String[1];

        for (MultipartFile file : file1) {
            Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
                 filenames[0]=file.getOriginalFilename();
                 try {
                   Files.write(fileNameAndPath, file.getBytes());
               } catch (IOException e) {
                   e.printStackTrace();
               }
              }
            
            gallery.setGallery_title(newGallery.getGallery_title());
            gallery.setGallery_desc(newGallery.getGallery_desc());
            gallery.setGallery_photo(filenames[0]);
            
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
            String strDate = dateFormat.format(date);  
            
            gallery.setGallery_date(strDate);
        

        galleryService.save(gallery);
        
        return "redirect:/admin/gallery_list";
    }


}
