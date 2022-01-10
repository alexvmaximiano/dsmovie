import './style.css';
import { ReactComponent as GitHubIcon } from "assets/images/github.svg";

function NavBar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/alexvmaximiano">
                        <div className="dsmovie-contact-container">
                            <GitHubIcon />
                            <p className="dsmovie-contact-link">/alexvmaximiano</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default NavBar;