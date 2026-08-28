import { StrictMode } from 'react';
import { createRoot } from 'react-dom/client';
import './styles.css';

function App() {
  return <main><h1>EquipIT</h1><p>Connectez le client à l'API Spring Boot pendant l'Exercice 2.</p></main>;
}

createRoot(document.getElementById('root')!).render(<StrictMode><App /></StrictMode>);